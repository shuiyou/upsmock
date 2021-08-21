package com.ipaylinks.upsmock.controller;

import Common.parseXmlUtils;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import com.ipaylinks.upsmock.Dao.TrackInfo;
import com.ipaylinks.upsmock.Dao.TrackResponse;
import com.ipaylinks.upsmock.Dao.UpsRequest;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.ArrayList;
import java.util.List;

import static com.ipaylinks.upsmock.Dao.ConstantUPS.*;

@Slf4j
@RestController
//@RequestMapping(value = "/ShippingAPI")
public class upsController
{
	private static final Logger logger = LoggerFactory.getLogger(upsController.class);
	@GetMapping(value = "/ShippingAPI.dll")
	@ResponseBody
	public ResponseEntity<String> getUpsInfo(@RequestParam("API") String API,@RequestParam("XML") String XML)
	{
		logger.info("开始物流mock");

		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.setDefaultUseWrapper( false );
		//字段为null，自动忽略，不再序列化
		xmlMapper.setSerializationInclusion( JsonInclude.Include.NON_NULL );
		xmlMapper.configure( ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true );


		TrackResponse r = new TrackResponse();
		List<TrackInfo> t = new ArrayList<>();

		if (API.equals( "TrackV2" ) & !XML.isEmpty())
		{
			UpsRequest upsRequest = parseXmlUtils.xmlToBean( XML );
			for (String s : upsRequest.getID())
			{

				if (s.endsWith( "1" ))
				{
					TrackInfo i = new TrackInfo();
					i.setId( s );
					i.setTrackSummary( delivered_success_ );
					List<String> successList = new ArrayList<>();
					successList.add( "Your item has been delivered and is available at a PO Box at 8:30 am on May 24, 2021 in PETALUMA, CA 94975." );
					successList.add( "Arrived at USPS Regional Origin Facility, 05/21/2021, 7:35 pm, KEARNY NJ DISTRIBUTION CENTER" );
					successList.add( "Accepted at USPS Origin Facility, May 21, 2021, 6:20 pm, MONROE TOWNSHIP, NJ 08831" );
					successList.add( "Pre-Shipment Info Sent to USPS, USPS Awaiting Item, May 21, 2021" );
					i.setTrackDetail( successList );
					t.add( i );
				}
				if (s.endsWith( "2" ))
				{
					TrackInfo i = new TrackInfo();
					i.setId( s );
					i.setTrackSummary( handing );
					List<String> successList = new ArrayList<>();
					successList.add( "Accepted at USPS Origin Facility, May 21, 2021, 6:20 pm, MONROE TOWNSHIP, NJ 08831" );
					successList.add( "Pre-Shipment Info Sent to USPS, USPS Awaiting Item, May 21, 2021" );
					i.setTrackDetail( successList );
					t.add( i );
				}
				if (s.endsWith( "3" ))
				{
					TrackInfo i = new TrackInfo();
					i.setId( s );
					i.setTrackSummary( not_available );
					List<String> successList = new ArrayList<>();
					successList.add("A status update is not yet available on your package" );
					successList.add( "Pre-Shipment Info Sent to USPS, USPS Awaiting Item, May 21, 2021" );
					i.setTrackDetail( successList );
					t.add( i );
				}
				if(s.endsWith( "4" ) ||s.endsWith( "5" ) ||s.endsWith( "6" )||s.endsWith( "7" )||s.endsWith( "8" )||s.endsWith( "9" )||s.endsWith( "0" )){
					TrackInfo i = new TrackInfo();
					i.setId( s );
					i.setTrackSummary( delivered_success_ );
					List<String> successList = new ArrayList<>();
					successList.add( "Your item has been delivered and is available at a PO Box at 8:30 am on May 24, 2021 in PETALUMA, CA 94975." );
					successList.add( "Arrived at USPS Regional Origin Facility, 05/21/2021, 7:35 pm, KEARNY NJ DISTRIBUTION CENTER" );
					successList.add( "Accepted at USPS Origin Facility, May 21, 2021, 6:20 pm, MONROE TOWNSHIP, NJ 08831" );
					successList.add( "Pre-Shipment Info Sent to USPS, USPS Awaiting Item, May 21, 2021" );
					i.setTrackDetail( successList );
					t.add( i );
				}

				r.setTrackInfo( t );
			}
				try
				{

					String requestBody = xmlMapper.writeValueAsString( r );
					String converRquest =requestBody.replaceAll( "trackInfo","TrackInfo" ).replaceAll( "trackSummary","TrackSummary").replaceAll( "trackDetail","TrackDetail" );
					return ResponseEntity.ok().header( "Content-Type","text/html; charset=UTF-8").body( converRquest );

					//					return requestBody;
				}
				catch (JsonProcessingException e)
				{
					e.printStackTrace();
				}

		}
		return null;

	}
}
