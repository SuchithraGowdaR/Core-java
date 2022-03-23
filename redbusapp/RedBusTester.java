package com.xworkz.redbusapp;

import com.xworkz.redbusapp.agency.TravelAgency;
import com.xworkz.redbusapp.contract.RedBusContractIntf;
import com.xworkz.redbusapp.srs.SrsImplementation;

public class RedBusTester {
	public static void main(String[] args) {
		RedBusContractIntf redbuscontract= new SrsImplementation();
		
		TravelAgency agency= new TravelAgency(redbuscontract);
		
		agency.booking (21);
	}

}
