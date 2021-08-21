package com.ipaylinks.upsmock.Dao;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args)
	{
//		XmlMapper xmlMapper = new XmlMapper();
//		xmlMapper.setDefaultUseWrapper(false);
//		//字段为null，自动忽略，不再序列化
//		xmlMapper.setSerializationInclusion( JsonInclude.Include.NON_NULL);
//		//XML标签名:使用骆驼命名的属性名，
//		xmlMapper.setPropertyNamingStrategy( PropertyNamingStrategy.UPPER_CAMEL_CASE);
//		//设置转换模式
//		xmlMapper.enable( MapperFeature.USE_STD_BEAN_NAMING);
//
//		TrackResponse r = new TrackResponse();
//		TrackInfo i = new TrackInfo();
//		TrackInfo i2 = new TrackInfo();
//
//		i.setId( "12344" );
//		i2.setId( "456667" );
//
//
//		i.setTrackSummary( "Your item was delivered to the front desk, reception area, or mail room at 12:55 pm on May 21, 2021 in ROSELLE PARK, NJ 07204." );
//		i2.setTrackSummary( "Your item was delivered to the front desk, reception area, or mail room at 12:55 pm on May 21, 2021 in ROSELLE PARK, NJ 07204." );
//
//		List<String> a  = new ArrayList<String>( );
//		List<String> b  = new ArrayList<String>( );
//
//		a.add("Out for Delivery, 05/21/2021, 6:50 am, ROSELLE PARK, NJ 07204");
//		a.add( "Arrived at Post Office, 05/21/2021, 6:39 am, ELIZABETH, NJ 07208" );
//
//		b.add("Out for Delivery, 05/21/2021, 6:50 am, ROSELLE PARK, NJ 07204");
//		b.add( "Arrived at Post Office, 05/21/2021, 6:39 am, ELIZABETH, NJ 07208" );
//		i.setTrackDetail(a);
//		i2.setTrackDetail( b );
//		List<TrackInfo> t = new ArrayList<>();
//		t.add( i );
//		t.add( i2 );
//		r.setTrackInfo( t );
//		String result = null;
//		try
//		{
//			result = xmlMapper.writeValueAsString(r);
//		}
//		catch (JsonProcessingException e)
//		{
//			e.printStackTrace();
//		}
//		System.out.println("序列化结果：" + result);

	}
}
