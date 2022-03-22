package com.xworks.socialmediaapp.dto;

public class RailwayStationDTO {
	public String adress;
	public int platform;
	public int pinCode;
	
	public RailwayStationDTO(){
		System.out.println(this.getClass().getSimpleName()+" objrct is created");
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPlatform() {
		return platform;
	}

	public void setPlatform(int platform) {
		this.platform = platform;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "RailwayStation [adress=" + adress + ", platform=" + platform + ", pinCode=" + pinCode + "]";
	}

	@Override
	public int hashCode() {
		return pinCode;
	}
	@Override
	public boolean equals(Object o) {
		RailwayStationDTO dto=(RailwayStationDTO)o;
		if(this.platform==dto.platform)
			return true;
		return false;
	}

}
