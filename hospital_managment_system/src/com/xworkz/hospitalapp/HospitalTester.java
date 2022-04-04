package com.xworkz.hospitalapp;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.xworkz.hospitalapp.dto.PatientDTO;
import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalTester {
	public static void main(String[] args) {
		
	
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the size");
	int size=scn.nextInt();
	
	Hospital hospital= new Hospital(size);
	
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
	dto.setGender(scn.next());
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
	hospital.getPatientBygender(scn.next());
	
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
	}
	
}
	


