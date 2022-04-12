package com.xworkz.dto;

public class SampleDTO implements Comparable <SampleDTO> {
	private int id;
	
	public SampleDTO(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "SampleDTO [id=" + id + "]";
	}


	@Override
	public int compareTo(SampleDTO o) {
		
		return o.id-this.id;
	}

	
}
