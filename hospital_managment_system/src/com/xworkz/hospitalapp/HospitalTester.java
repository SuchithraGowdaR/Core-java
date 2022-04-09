package com.xworkz.hospitalapp;
import java.util.Scanner;


import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.dto.PatientDTO;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.hospital.implement.Hospitalimpl;

public class HospitalTester {
	public static void main(String[] args) {
		
	
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the size");
	int size=scn.nextInt();
	
	Hospital hospital= new Hospitalimpl(size);
	
	for(int i=0 ; i<size ; i++){
	
	PatientDTO dto=new PatientDTO();
	
	System.out.println("enter id");
	dto.setId(scn.nextInt());
	
	System.out.println("enter name");
	dto.setPatientName(scn.next());
	
	System.out.println("enter adress");
	dto.setAdress(scn.next());
	
	System.out.println("enter contact number");
	dto.setPhoneNumber(scn.nextLong());
	
	System.out.println("enter disease");
	dto.setDisease(scn.next());
	
	System.out.println("enter age");
	dto.setAge(scn.nextInt());
	
	System.out.println("enter gender");
	String gender=scn.next();
	dto.setGender(Gender.valueOf(gender));
	
	System.out.println("enter bloodgroup");
	dto.setBldgroup(scn.next());
	
	hospital.createPatientDetails(dto);
	
	}
	
	hospital.getAllPatientDetails();
	
	System.out.println("Enter the id ");
	hospital.getPatientById(scn.nextInt());
	
	System.out.println("Enter phonnum,name");
	hospital.updateContactNoByPatientName(scn.nextLong(),scn.next());
	
	System.out.println("enter the id");
	hospital.deletePatientById(scn.nextInt());
	
	System.out.println("enter patientName");
	hospital.getPatientByName(scn.next());
	
	System.out.println("enter gender");
	hospital.getPatientBygender(Gender.valueOf(scn.next()));
	
	System.out.println("enter contactNumber");
	hospital.getPatientByContactNum(scn.nextLong());
	
	System.out.println("enter patient age");
	hospital.getPatientByAge(scn.nextInt());
	
	System.out.println("enter patient adress");
	hospital.getPatientByAdress(scn.next());
	
	System.out.println("enter patient id");
	hospital.getPatientNameById(scn.nextInt());
	
	System.out.println("enter patient id");
	hospital.getPatientNameById(scn.nextInt());
	
	System.out.println("enter patient name");
	hospital.getpatientIdByName(scn.next());
	
	System.out.println("enter patient name");
	hospital.getpatientAdressByNmae(scn.next());
	
	System.out.println("enter patient name");
	hospital.getpatientGenderByNmae(scn.next());
	
	String text=null;
	
	do {
		 System.out.println("enter 1 to get the patient details ");
		 System.out.println("enter 2 to get the patient details by id");
		 System.out.println("enter 3 to update the contact number by name");
		 System.out.println("enter 4 to delete the patient by id");
		 System.out.println("enter 5 to get the patient details by name");
		 System.out.println("enter 6 to get the patient details by gender");
		 System.out.println("enter 7 to get the patient details by contact number");
		 System.out.println("enter 8 to get the patient details by age");
		 System.out.println("enter 9 to get the patient details by adress");
		 System.out.println("enter 10 to get the patient name by id");
		 System.out.println("enter 11 to get the patient id by name");
		 System.out.println("enter 12 to get the patient adress by name");
		 System.out.println("enter 13 to get the patient gender by name");
		 System.out.println("enter 14 to get all the patient");
		 System.out.println("enter 15 to get all the blood group");
		 System.out.println("enter 16 to get all the gender ");
		 System.out.println("enter 17 to update the patient adress by name");
		 System.out.println("enter 18 to update the  gender by name");
		 System.out.println("enter your choice ");
		 int choice=scn.nextInt();
		 
		 switch(choice) {
		 
		 case 1:
			 hospital.getAllPatientDetails();
			 break;
			 
		 case 2:
			 System.out.println("enter the id");
			 System.out.println(hospital.getPatientById(scn.nextInt()));
			 break;
			 
		 case 3:
			 System.out.println("enter the new contact number and patient name");
			 hospital.updateContactNoByPatientName(scn.nextLong(),scn.next());
			 break;
			 
		 case 4:
			 System.out.println("enter the id");
			 System.out.println(hospital.deletePatientById(scn.nextInt()));
			 break;
		 case 5:
			 System.out.println("enter the name");
			 System.out.println(hospital.getPatientByName(scn.next()));
			 break;
			 
		 case 6:
			 System.out.println("enter the gender");
			 hospital.getPatientBygender(Gender.valueOf(scn.next()));
			 break;
			 
		 case 7:
			 System.out.println("enter the Contact Num");
			 System.out.println(hospital.getPatientByContactNum(scn.nextLong()));
			 break;
			 
		 case 8:
			 System.out.println("enter the Age");
			 System.out.println(hospital.getPatientByAge(scn.nextInt()));
			 break;
			 
		 case 9: 
			 System.out.println("enter the Adress");
			 System.out.println(hospital.getPatientByAdress(scn.next()));
			 break;
			 
		 case 10:
			 System.out.println("enter the id");
			 System.out.println(hospital.getPatientNameById(scn.nextInt()));
			 break;
			 
		 case 11:
			 System.out.println("enter the name");
			 System.out.println(hospital.getpatientIdByName(scn.next()));
			 break;
			 
		 case 12:	
			 System.out.println("enter the name");
			 System.out.println(hospital.getpatientAdressByNmae(scn.next()));
			 break;
			 
		 case 13:
			 System.out.println("enter the name");
			 System.out.println(hospital.getpatientGenderByNmae(scn.next()));
			 break;
			 
		 case 14:
			 hospital.getAllPatients();
			 break;
			 
		 case 15:
		 		hospital.getAllBloodGroup();
		 		break;
		 		
		 case 16:
			 hospital.getAllGender();
			 break;
			 
		 case 17:
			 System.out.println("enter the new adress and patient name");
			 hospital.UpdateAdressByPatientName(scn.next(),scn.next());
			 break;
			 
		 case 18:
			 System.out.println("enter the gender and patient id");
			 hospital.UpdateGenderByPatientId(Gender.valueOf(scn.next()), scn.nextInt());
			 break;
			 
		 default:
				System.out.println("no choice Available.... enter valid number");	 
		 }

		 System.out.println("do you want to continue say yes/no");
		 text=scn.next();
		 
	}while(text.equalsIgnoreCase("YES"));
	}
	
}
	


