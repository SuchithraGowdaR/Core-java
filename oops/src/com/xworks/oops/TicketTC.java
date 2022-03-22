package com.xworks.oops;

import com.xworks.oops.encapsulation.TicketDTO;

public class TicketTC {
	public static void main(String []ar) {
	TicketDTO	train =new TicketDTO();
	
	train.setVehicle("Train");
	String tra=train.getVehicle();
	System.out.println("vehicle= "+tra);
	
	train.setCouch("Sleeper Couch");
	String coc=train.getCouch();
	System.out.println(coc);
	
	train.setTrainname("Thirupathi Express");
	String trnm=train.getTrainname();
	System.out.println("Name of Train: "+trnm);
	
	train.setStation("Banglore to Andra");
	String stn=train.getStation();
	System.out.println(stn);
	
	train.setSeat(1000);
	int seat=train.getSeat();
	System.out.println("Number of seats: "+seat);
	
	train.setNumberOfPassangers(850);
	int numps=train.getNumberOfPassangers();
	System.out.println("Number of Pasanger: "+numps);
		
	train.setPrice(350.500f);
	float prc=train.getPrice();
	System.out.println(prc);
	
	train.setDateDeparcher("25/03/2022");
	String dtdp=train.getDateDeparcher();
	System.out.println("Date of Deparchar: "+dtdp);
	
	train.setDateAriver("26/03/2022");
	String dtar=train.getDateAriver();
	System.out.println("Date of Arivel: "+dtar);
	
	train.setPlatform((short) 5);
	short ptfm=train.getPlatform();
	System.out.println("Platform Number: "+ptfm);
	}

}
