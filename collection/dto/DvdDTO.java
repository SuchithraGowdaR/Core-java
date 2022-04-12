package com.xworkz.dto;

public class DvdDTO implements Comparable<DvdDTO>{
	private int num;
	private String ram;
	private String weight;
	
	public DvdDTO(int num,String ram,String weight) {
		this.num=num;
		this.ram=ram;
		this.weight=weight;
	}
	 public String getRam() {
		 return ram;
	 }

	 public String getWeight() {
		 return weight;
	 }
	@Override
	public String toString() {
		return "DvdDTO [num="+ num +", ram=" + ram + ", weight=" + weight + "]";
	}
	@Override
	public int compareTo(DvdDTO o) {
		// TODO Auto-generated method stub
		return o.num-this.num;
	}

}
