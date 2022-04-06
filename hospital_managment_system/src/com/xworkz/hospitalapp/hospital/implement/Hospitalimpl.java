package com.xworkz.hospitalapp.hospital.implement;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.dto.PatientDTO;
import com.xworkz.hospitalapp.hospital.Hospital;

public class Hospitalimpl implements Hospital{

	public PatientDTO patientDTO[];
	int index;
	PatientDTO gender;
	
	
	public Hospitalimpl(int size) {
		patientDTO=new PatientDTO[size];
		
	}
	
	public boolean createPatientDetails(PatientDTO dto) {
		System.out.println("invoking createPatientDetails");
		boolean patientAdded= false;
		try {
			if(dto != null) {
			patientDTO[index++]=dto;
			patientAdded=true;
			}
			else {
			System.out.println("no patient added");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
			System.out.println("end of createPatientDetails ");
		return patientAdded;
		}
	
		public void getAllPatientDetails() {
			System.out.println("inside getAllPatientDetails().... fetching the data");
			try {
			for(int i=0; i<patientDTO.length; i++) {
				System.out.println(patientDTO[i]);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("end of getAllPatientDetails");
		}
		
		public PatientDTO getPatientById(int PatientId) {
			
			System.out.println("inside getPatientById()");
			System.out.println("arg 1 Patient Id: "+ PatientId);
			try {
			for (int i=0 ; i<patientDTO.length ; i++) {
					if(patientDTO[i].getId() == PatientId) {
							System.out.println(patientDTO[i]);
				
					}
					else {
						System.out.println("Patient not found with this Id");
					}
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		 public void updateContactNoByPatientName(long contactNo,String patientName ) {
			
			System.out.println("invoking updateContactNoByPatientName() ");
			System.out.println("1st arg: ContactNo: "+contactNo);
			System.out.println("2nd arg: patientName: "+patientName);
			 
			 try {
			for (int i = 0; i < patientDTO.length; i++) {
				if(patientDTO[i].getPatientName().equals(patientName)) {
				System.out.println("update succesfull");
				}
				else {
				System.out.println("patient not found with this Id");
				}
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	
		}

		public boolean deletePatientById(int patientId) {
			boolean delete= false;
			try {
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
			}catch(Exception e) {
				e.printStackTrace();
			}
			return delete;
		}
		
		public PatientDTO getPatientByName(String patientName) {
			// PatientDTO dto=null;
			System.out.println("inside getPatientByName()");
			System.out.println("arg 1 patient PatientName: "+patientName);
			try{
				for(int i=0 ; i<patientDTO.length ; i++) {
				if(patientDTO[i].getPatientName().equals(patientName)) {
					System.out.println(patientDTO[i]);
				}
				else {
					System.out.println("patient not found with this name");
				}
			}
			}catch(NullPointerException ne){
				ne.printStackTrace();
			}
			return null;
		}
		
		public PatientDTO getPatientBygender(String gender) {
			 //PatientDTO dto=null;
			try {
			for (int i = 0; i < patientDTO.length; i++) {
				if(patientDTO[i].getGender().equals(gender)) {
					System.out.println(patientDTO[i]);
					
				}
				else {
					System.out.println("patient not found with this gender");
				}
			}
			}catch(NullPointerException ne) {
				ne.printStackTrace();
			}
			return null;
		}
		
		public PatientDTO getPatientByContactNum(long cntnum) {
			 //PatientDTO dto=null;
			try {
			for(int i=0 ; i<patientDTO.length ; i++) {
				if(patientDTO[i].getPhoneNumber()==cntnum) {
					System.out.println(patientDTO[i]);
				}
				else {
					System.out.println("not found this contact number");
				}
			}
			}catch(NullPointerException ne) {
				ne.printStackTrace();
			}
			return null;
		}
		
			
		public  PatientDTO getPatientByAge(int age) {
			 //PatientDTO dto=null;
			 try {
			 for(int i=0 ; i<patientDTO.length ; i++) {
				if(patientDTO[i].getAge()==age) {
					System.out.println(patientDTO[i]);
				}
				else {
					System.out.println("patient not found with this age");
				}
			}
			}catch(NullPointerException ne) {
				ne.printStackTrace(); 
			 }
			return null;
		}
		
		
		public PatientDTO getPatientByAdress(String adrs) {
			//PatientDTO dto=null;
			try {
			for(int i=0 ; i<patientDTO.length ; i++) {
				if(patientDTO[i].getAdress().equals(adrs)) {
					System.out.println(patientDTO[i]);
				}
				else {
					System.out.println("patient not found with this Adress");
				}
			}
			}catch(NullPointerException ne) {
				ne.printStackTrace();
			}
			return null;
		}
		
		public String getPatientNameById(int id) {
			//String name="";
			try {
			for(int i=0 ; i<patientDTO.length ; i++) {
				if(patientDTO[i].getId()==id) {
					System.out.println(patientDTO[i].getPatientName());
				}
				else {
					System.out.println("patient not found with this Id");
				}
			}
			}catch(NullPointerException ne) {
				ne.printStackTrace();
			}
			
			return null;
		}
		
		public int getpatientIdByName(String name) {
			//int id=0;
			try {
			for(int i=0 ; i<patientDTO.length ; i++){
				if(patientDTO[i].getPatientName().equals(name)) {
					System.out.println(patientDTO[i].getId());
				}
				else {
					System.out.println("patient not found with this name");
				}
			}
			}catch(NullPointerException ne) {
				ne.printStackTrace();
			}
			return 0;
		}
		
		public String getpatientAdressByNmae(String name) {
			//String adress="";
			try {
			for(int i=0 ; i<patientDTO.length ; i++){
				if(patientDTO[i].getPatientName().equals(name)) {
					System.out.println(patientDTO[i].getAdress());
				}
				else {
					System.out.println("patient not found with this name");
				}
			}
			}catch(NullPointerException ne) {
				ne.printStackTrace();
			}
			return null;
		}
		
		public Gender getpatientGenderByNmae(String name) {
				//Gender gender=null;
			try {
			for(int i=0 ; i<patientDTO.length ; i++){
				if(patientDTO[i].getPatientName().equals(name)) {
					System.out.println(patientDTO[i].getGender());
				}
				else {
					System.out.println("patient not found with this name");
				}
			}
			}catch(NullPointerException ne) {
					ne.printStackTrace();
			 }
			return null;
		}

}
