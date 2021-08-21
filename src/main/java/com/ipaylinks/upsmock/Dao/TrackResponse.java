package com.ipaylinks.upsmock.Dao;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;


@JacksonXmlRootElement(localName ="TrackResponse")
public class TrackResponse {
	private List<TrackInfo> trackInfo;



	public List<TrackInfo> getTrackInfo()
	{
		return trackInfo;
	}


	public void setTrackInfo(List<TrackInfo> trackInfo)
	{
		this.trackInfo = trackInfo;
	}


}
