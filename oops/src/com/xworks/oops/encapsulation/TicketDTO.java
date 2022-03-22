package com.xworks.oops.encapsulation;

public class TicketDTO {
	private String vehicle;
	private String couch;
	private String trainname;
	private String station;
	private int seat;
	private int numberOfPassangers;
	private float price;
	private String dateDeparcher;
	private String dateAriver ;
	private short platform;
	
	public TicketDTO() {
		
	}
	
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public String getCouch() {
		return couch;
	}
	public void setCouch(String couch) {
		this.couch = couch;
	}
	public String getTrainname() {
		return trainname;
	}
	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public  int getSeat() {
		return seat;
	}
	public  void setSeat(int seat) {
		this.seat = seat;
	}
	public  int getNumberOfPassangers() {
		return numberOfPassangers;
	}
	public void setNumberOfPassangers(int numberOfPassangers) {
		this.numberOfPassangers = numberOfPassangers;
	}
	public  float getPrice() {
		return price;
	}
	public  void setPrice(float price) {
		this.price = price;
	}
	public String getDateDeparcher() {
		return dateDeparcher;
	}
	public  void setDateDeparcher(String dateDeparcher) {
		this.dateDeparcher = dateDeparcher;
	}
	public  String getDateAriver() {
		return dateAriver;
	}
	public  void setDateAriver(String dateAriver) {
		this.dateAriver = dateAriver;
	}
	public  short getPlatform() {
		return platform;
	}
	public  void setPlatform(short platform) {
		this.platform = platform;
	}

}
