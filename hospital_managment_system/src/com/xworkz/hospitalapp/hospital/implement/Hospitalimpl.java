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
					patientDTO[i].setPhoneNumber(contactNo);
					System.out.println(contactNo);
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
			System.out.println("invoking deletePatientById() ");
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
			System.out.println("invoking getPatientByName() ");
			PatientDTO dto=null;
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
			return dto;
		}
		
		public PatientDTO getPatientBygender(Gender gender) {
			System.out.println("invoking getPatientByGender() ");
			 PatientDTO dto=null;
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
			return dto;
		}
		
		public PatientDTO getPatientByContactNum(long cntnum) {
			System.out.println("invoking getPatientByContactNum() ");
			 PatientDTO dto=null;
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
			return dto;
		}
		
			
		public  PatientDTO getPatientByAge(int age) {
			System.out.println("invoking getPatientByAge() ");
			 PatientDTO dto=null;
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
			return dto;
		}
		
		
		public PatientDTO getPatientByAdress(String adrs) {
			System.out.println("invoking getPatientByAdress() ");
			PatientDTO dto=null;
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
			return dto;
		}
		
		public String getPatientNameById(int id) {
			System.out.println("invoking getPatientById() ");
			String name="";
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
			
			return name;
		}
		
		public int getpatientIdByName(String name) {
			System.out.println("invoking getpatientIdByName() ");
			int id=0;
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
			System.out.println("invoking getpatientAdressByNmae() ");
			String adress="";
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
			return adress;
		}
		
		public Gender getpatientGenderByNmae(String name) {
			System.out.println("invoking getpatientGenderByNmae() ");
				Gender gender=null;
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
			return gender;
		}

		public String[] getAllPatients() {
			System.out.println("invoking getAllPatients() ");
			String[] Patients=null;
			try {
			Patients=new String[patientDTO.length];
			for (int i = 0; i < patientDTO.length; i++) {
				Patients[i]=patientDTO[i].getPatientName();
				System.out.println(patientDTO[i].getPatientName());
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
			return Patients;
		}
		
		public String[] getAllBloodGroup() {
			System.out.println("invoking getAllBloodGroup() ");
			String[] BloodGroup=null;
			try {
			BloodGroup=new String[patientDTO.length];
			for (int i = 0; i < patientDTO.length ; i++) {
				BloodGroup[i]=patientDTO[i].getAdress();
				System.out.println(patientDTO[i].getBldgroup());
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
			return BloodGroup;
		}
		
		public Gender[] getAllGender() {
			System.out.println("invoking getAllGender() ");
			Gender[] gender=null;
			try {
			gender=new Gender[patientDTO.length];
			for (int i = 0; i < patientDTO.length ; i++) {
				gender[i]=patientDTO[i].getGender();
				System.out.println(patientDTO[i].getGender());
			}
			}catch(Exception e) {
				System.out.println("Exception");
			}
			return gender;
		}
		
		public String UpdateAdressByPatientName(String adress,String name) {
			System.out.println("invoking UpdateAdressByPatientName() ");
			String adress1=null;
			try {
			for (int i = 0; i < patientDTO.length; i++) {
				if(patientDTO[i].getPatientName().equals(name)) {
					patientDTO[i].setAdress(adress);
					System.out.println(adress);
				}
				else {
					System.out.println("this patient not found");
				}
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
			return adress1;
		}
		
		public Gender   UpdateGenderByPatientId(Gender gender, int id) {
			System.out.println("invoking UpdateGenderByPatientId() ");
			Gender gnr=null;
			try {
			for (int i = 0; i < patientDTO.length; i++) {
				if(patientDTO[i].getId()==id) {
					patientDTO[i].setGender(gender);
					System.out.println(gender);
				}
				else {
					System.out.println("id not found");
				}
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
			return gnr;
		}
}

/*getAllPatients();
  getAllBloodGroup();
  getAllGenders();
  UpdateAdressByPatientName();
  UpdateGenderByPatient();
  getStreetNoByPatientName();*/
  