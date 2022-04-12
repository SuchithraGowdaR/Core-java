package com.xworkz.dto;

public class PaintDTO implements Comparable <PaintDTO>{
	private int rfNumber;
	private String brand;
	private String typeOfPaint;
	private String color;
	private String quantity;
	
	public PaintDTO(int rfNumber,String brand,String typeOfPaint,String color,String quantity){
		this.rfNumber=rfNumber;
		this.brand=brand;
		this.typeOfPaint=typeOfPaint;
		this.color=color;
		this.quantity=quantity;
	}

	public int getRfNumber() {
		return rfNumber;
	}

	public void setRfNumber(int rfNumber) {
		this.rfNumber = rfNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getTypeOfPaint() {
		return typeOfPaint;
	}

	public void setTypeOfPaint(String typeOfPaint) {
		this.typeOfPaint = typeOfPaint;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "PaintDTO [rfNumber=" + rfNumber + ", brand=" + brand + ", typeOfPaint=" + typeOfPaint + ", color="
				+ color + ", quantity=" + quantity + "]";
	}

	@Override
	public int compareTo(PaintDTO o) {
		// TODO Auto-generated method stub
		return this.rfNumber-o.rfNumber;
	}
	

}
