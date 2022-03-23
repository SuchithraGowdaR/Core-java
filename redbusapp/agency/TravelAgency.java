package com.xworkz.redbusapp.agency;

import com.xworkz.redbusapp.contract.RedBusContractIntf;

public class TravelAgency {
	//has-a realation
	RedBusContractIntf redBusContract;
	static String name="Sri Shrishial travel agency";
	
	public TravelAgency(RedBusContractIntf redBusContract) {
		super();
		//TODO auto-generation constructor stub
		this.redBusContract=redBusContract;
		
	}
	
	public boolean booking(int noOfBookings) {
		boolean booking=false;
		System.out.println("inside booking() ");
		boolean warrenty = redBusContract.warrenty();
		if(warrenty) {
			System.out.println("checked warrenty ... Please proced for booking");
			if(noOfBookings <= redBusContract.minBooking() ) {
			
				System.out.println("Booking is successful");
				booking=true;
			}
			else {
				System.out.println("can't proceed with booking..."
						+"As no of bookings is exceeding "
		    	+"the limited booking from Cntract" );
			}
			System.out.println("End of booking()");
		}
		return booking;
	}

}
