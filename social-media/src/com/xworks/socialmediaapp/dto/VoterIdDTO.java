package com.xworks.socialmediaapp.dto;

public class VoterIdDTO {
	private int idNum;
	private String name;
	private String dob;
	private String gender;
	
	public VoterIdDTO() {
		System.out.println(this.getClass().getSimpleName()+" objrct is created");
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String  toString() {
		return "VoterIdDTO-[Voter ID: "+idNum+"\tName: "+name+"\tDOB: "+dob+"\tGender: "+gender;
	}
	@Override
	public int hashCode() {
		return idNum;
	}
	@Override
	public boolean equals(Object o) {
		VoterIdDTO dto=(VoterIdDTO)o;
		if (this.hashCode()==dto.hashCode())
			return true;
		
		if (this.dob == dto.dob)
			return true;
		return false;
		
	}

}
