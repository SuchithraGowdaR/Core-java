package com.xworkz.hospitalapp.dto;
import com.xworkz.hospitalapp.constant.Gender;

public class PatientDTO {
	
	private int id;
	private String patientName;
	private String adress;
	private long phoneNumber;
	private String disease;
	private int age;
	private Gender gender;
	private String bldgroup;
	
	public PatientDTO() {
		System.out.println("invoking PatientDTO constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getBldgroup() {
		return bldgroup;
	}

	public void setBldgroup(String bldgroup) {
		this.bldgroup = bldgroup;
	}

	@Override
	public String toString() {
		return "PatientDTO [id=" + id + ", patientName=" + patientName + ", adress=" + adress + ", phoneNumber="
				+ phoneNumber + ", disease=" + disease + ", age=" + age + ", gender=" + gender + ", bldgroup="
				+ bldgroup + "]";
	}
	
	}
	
	

