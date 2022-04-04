package com.xworkz.hospitalapp.hospital;
import java.util.Iterator;
import java.util.concurrent.ForkJoinPool;

import com.xworkz.hospitalapp.dto.PatientDTO;

public class Hospital {
	public PatientDTO patientDTO[];
	int index;
	
	public Hospital(int size) {
		patientDTO=new PatientDTO[size];
		
	}
	
	public boolean createPatientDetails(PatientDTO dto) {
		System.out.println("invoking crdtoeatePatientDetails");
		boolean patientAdded= false;
		if(dto != null) {
			patientDTO[index++]=dto;
			patientAdded=true;
		}
		else {
			System.out.println("no patient found");
		}
		System.out.println("end of createPatientDetails ");
		return patientAdded;
		}
	
		public void getAllPatientDetails() {
			System.out.println("inside getAllPatientDetails().... fetching the data");
			for(int i=0; i<patientDTO.length; i++) {
				System.out.println(patientDTO[i]);
			}
			System.out.println("end of getAllPatientDetails");
		}
		
		public void getPatientById(int PatientId) {
			System.out.println("inside getPatientById()");
			System.out.println("arg 1 Patient Id: "+ PatientId);
			for (int i=0 ; i<patientDTO.length ; i++) {
				if(patientDTO[i].getId() == PatientId) {
				System.out.println(patientDTO[i]);
				break;
				}
				else {
				System.out.println("Patient not found with this Id");
				}
			}
		}
		
		public void updateContactNoByPatientName(long contactNo,String patientName ) {
			System.out.println("invoking updateContactNoByPatientName() ");
			System.out.println("1st arg: ContactNo: "+contactNo);
			System.out.println("2nd arg: patientName: "+patientName);
			for (int i = 0; i < patientDTO.length; i++) {
				if(patientDTO[i].getPatientName().equals(patientName)) {
				System.out.println("update succesfull");
				break;
				}
				else {
				System.out.println("patient not found with this Id");
				}
			}
		}

		public boolean deletePatientById(int patientId) {
			boolean delete= false;
			for (int i=0 ; i<patientDTO.length ;i++){
				if(patientDTO[i].getId()==patientId) {
					patientDTO[i]=null;//insted of deleting the variable object is deleted
					System.out.println("patient details deleted succesfully");
					return true;
				}
				else {
					System.out.println("patient not found with this Id");
				}
			}
			return delete;
		}
		
		public void getPatientByName(String patientName) {
			System.out.println("inside getPatientByName()");
			System.out.println("arg 1 patient PatientName: "+patientName);
			for(int i=0 ; i<patientDTO.length ; i++) {
				if(patientDTO[i].getPatientName().equals(patientName)) {
					System.out.println(patientDTO[i]);
				}
				else {
					System.out.println("patient not found with this name");
				}
			}
		}
		
		public void getPatientBygender(String gender) {
			for (int i = 0; i < patientDTO.length; i++) {
				if(patientDTO[i].getGender().equals(gender)) {
					System.out.println(patientDTO[i]);
				}
				else {
					System.out.println("patient not found with this gender");
				}
				
			}
		}
		public void getPatientByContactNum(long cntnum) {
			for(int i=0 ; i<patientDTO.length ; i++) {
				if(patientDTO[i].getPhoneNumber()==cntnum) {
					System.out.println(patientDTO[i]);
				}
				else {
					System.out.println("not found this contact number");
				}
			}
		}
		
		public void getPatientByAge(int age) {
			for(int i=0 ; i<patientDTO.length ; i++) {
				if(patientDTO[i].getAge()==age) {
					System.out.println(patientDTO[i]);
				}
				else {
					System.out.println("patient not found with this age");
				}
			}
			
		}
		
		public void getPatientByAdress(String adrs) {
			for(int i=0 ; i<patientDTO.length ; i++) {
				if(patientDTO[i].getAdress().equals(adrs)) {
					System.out.println(patientDTO[i]);
				}
				else {
					System.out.println("patient not found with this Adress");
				}
			}
		}
		
		public void getPatientNameById(int id) {
			for(int i=0 ; i<patientDTO.length ; i++) {
				if(patientDTO[i].getId()==id) {
					System.out.println(patientDTO[i].getPatientName());
				}
				else {
					System.out.println("patient not found with this Id");
				}
			}
		}
		
		public void getpatientIdByName(String name) {
			for(int i=0 ; i<patientDTO.length ; i++){
				if(patientDTO[i].getPatientName().equals(name)) {
					System.out.println(patientDTO[i].getId());
				}
				else {
					System.out.println("patient not found with this name");
				}
			}
		}
		
		public void getpatientAdressByNmae(String name) {
			for(int i=0 ; i<patientDTO.length ; i++){
				if(patientDTO[i].getPatientName().equals(name)) {
					System.out.println(patientDTO[i].getAdress());
				}
				else {
					System.out.println("patient not found with this name");
				}
			}
		}
		
		public void getpatientGenderByNmae(String name) {
			for(int i=0 ; i<patientDTO.length ; i++){
				if(patientDTO[i].getPatientName().equals(name)) {
					System.out.println(patientDTO[i].getGender());
				}
				else {
					System.out.println("patient not found with this name");
				}
			}
		}
}
//PatientDTO getPatientById
//PatientDTO getPatientByName

//PatientDTO getPatientByGenedr
//PatientDTO getPatientByContactNo

//PatientDTO getPatientByAge
//PatientDTO getPatientByAdress

// getPatientNameById