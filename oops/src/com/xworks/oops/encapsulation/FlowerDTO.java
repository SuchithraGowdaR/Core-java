package com.xworks.oops.encapsulation;

public class FlowerDTO {
	private String name;
	private String colour;
	private String kingdom;
	private String season;
	private int numberOfPetals;
	private int numberOfSepals;
	private String seedExistence;
	private String purpose;
	private int price;
	
	public FlowerDTO() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getKingdom() {
		return kingdom;
	}
	public void setKingdom(String typeOfPlant) {
		this.kingdom = typeOfPlant;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public int getNumberOfPetals() {
		return numberOfPetals;
	}
	public void setNumberOfPetals(int numberOfPetals) {
		this.numberOfPetals = numberOfPetals;
	}
	public int getNumberOfSepals() {
		return numberOfSepals;
	}
	public void setNumberOfSepals(int numberOfSepals) {
		this.numberOfSepals = numberOfSepals;
	}
	
	public String getSeedExistence() {
		return seedExistence;
	}
	public void setSeedExistence(String seedExistence) {
		this.seedExistence = seedExistence;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
