package com.ipaylinks.upsmock.Dao;
import java.util.List;


public class UpsRequest   {



	public UpsRequest(String USERID, List<String> ID){
		this.ID=ID;
		this.USERID=USERID;
	}

	public String getUSERID()
	{
		return USERID;
	}

	public void setUSERID(String USERID)
	{
		this.USERID = USERID;
	}

	public List<String> getID()
	{
		return ID;
	}

	public void setID(List<String> ID)
	{
		this.ID = ID;
	}

	private String USERID;


	private List<String> ID;

}
