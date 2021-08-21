package com.ipaylinks.upsmock.Dao;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class TrackInfo {

	@JacksonXmlProperty(isAttribute = true, localName = "ID")
	private String id;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getTrackSummary()
	{
		return TrackSummary;
	}

	public void setTrackSummary(String trackSummary)
	{
		this.TrackSummary = trackSummary;
	}

	public List<String> getTrackDetail()
	{
		return TrackDetail;
	}

	public void setTrackDetail(List<String> trackDetail)
	{
		this.TrackDetail = trackDetail;
	}



	private String TrackSummary;

	private List<String> TrackDetail;



}
