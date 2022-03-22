package com.xworks.socialmediaapp.dto;

public class HospitalDTO {
	public String name;
	public String adress;
	public int numOfWards;
	
	public HospitalDTO(){
		System.out.println(this.getClass().getSimpleName()+" object is created");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getNumOfWards() {
		return numOfWards;
	}
	public void setNumOfWards(int numOfWards) {
		this.numOfWards = numOfWards;
	}
	@Override
	public String toString() {
		return "HospitalDTO [name=" + name + ", adress=" + adress + ", numOfWards=" + numOfWards + "]";
	}
	@Override
	public int hashCode() {
		return numOfWards;
	}
	
	@Override
	public boolean equals(Object o) {
		HospitalDTO dto=(HospitalDTO)o;
		if(this.name==dto.name)
			return true;
		return false;
		
	}
	

}
