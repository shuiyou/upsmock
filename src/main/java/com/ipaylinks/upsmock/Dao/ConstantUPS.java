package com.ipaylinks.upsmock.Dao;

import java.util.ArrayList;
import java.util.List;

public class ConstantUPS {

	public static String  delivered_success_="Your item was delivered to the front desk, reception area, or mail room at 12:55 pm on May 21, 2021 in ROSELLE PARK, NJ 07204.";

	public static String  handing="Accepted at USPS Origin Facility， May 21, 2021, 6:08 pm, MONROE TOWNSHIP, NJ 08831";

	public static String not_available ="A status update is not yet available on your package";

	public static void main(String[] args)
	{
		List<String> s = new ArrayList<>();
		s.add( "Your item has been delivered and is available at a PO Box at 8:30 am on May 24, 2021 in PETALUMA, CA 94975." );
		s.add("Arrived at USPS Regional Origin Facility, 05/21/2021, 7:35 pm, KEARNY NJ DISTRIBUTION CENTER");
		s.add( "Accepted at USPS Origin Facility, May 21, 2021, 6:20 pm, MONROE TOWNSHIP, NJ 08831" );
		s.add( "Pre-Shipment Info Sent to USPS, USPS Awaiting Item, May 21, 2021" );


	}


}
