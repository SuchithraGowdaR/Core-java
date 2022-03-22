package com.xworks.oops.encapsulation;

public class TVDTO {

	private String brand;
	private String model;
	private int size;
	private float price;
	
	public TVDTO() {
		//TODO Auto-generated constructor stud
	}
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brandName){
		brand=brandName;
	}
	
	public String getModel(){
		return model;
	}
	public void setModel(String brandmodale){
		model=brandmodale;
	}
	
	public int getSize(){
		return size;
	}
	public void setSize(int Size) {
		size=Size;
	}
	
	public float getPrice(){
		return price;
	}
	public void setPrice(float prc) {
	price=prc;	
	}
}
