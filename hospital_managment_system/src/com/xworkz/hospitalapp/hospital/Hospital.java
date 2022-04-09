package com.xworkz.hospitalapp.hospital;
import java.util.Iterator;


import java.util.concurrent.ForkJoinPool;

import com.xworkz.hospitalapp.dto.PatientDTO;
import com.xworkz.hospitalapp.constant.Gender;

public interface Hospital {
	
		public boolean createPatientDetails(PatientDTO dto);
		public void getAllPatientDetails(); 
		public PatientDTO getPatientById(int PatientId);
		public void updateContactNoByPatientName(long contactNo,String patientName );
		public boolean deletePatientById(int patientId); 		
		public PatientDTO getPatientByName(String patientName);
		public PatientDTO getPatientBygender(Gender gender) ;
		public PatientDTO getPatientByContactNum(long cntnum);
			
		public  PatientDTO getPatientByAge(int age);
		public PatientDTO getPatientByAdress(String adrs);
		public String getPatientNameById(int id) ;
		
		public int getpatientIdByName(String name);
		public String getpatientAdressByNmae(String name);
		public Gender getpatientGenderByNmae(String name);
		public String[] getAllPatients();	
		public String[] getAllBloodGroup();
		public Gender[] getAllGender();
		public String UpdateAdressByPatientName(String adress,String name);
		public Gender   UpdateGenderByPatientId(Gender gender, int id);
}
