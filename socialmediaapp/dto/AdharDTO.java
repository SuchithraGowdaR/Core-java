package com.xworks.socialmediaapp.dto;

public class AdharDTO {
	private String name;
	private String dto;
	private String adress;
	private long adharNum;
	
	public AdharDTO() {
		System.out.println(this.getClass().getSimpleName()+" Obgect is created");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDto() {
		return dto;
	}

	public void setDto(String dto) {
		this.dto = dto;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getAdharNum() {
		return adharNum;
	}

	public void setAdharNum(long adharNum) {
		this.adharNum = adharNum;
	}
	@Override
	public String toString() {
	return "Name: "+name+"\tDOB: "+dto+"\tAdress: "+adress+"\tAdhar Number: "+adharNum;
	}
}
