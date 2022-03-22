package com.xworks.socialmediaapp.dto;

public class MetroDTO {
	public String startPoint;
	public String endPoint;
	public int metroNum;
	public int platFormNum;
	
	public MetroDTO() {
		System.out.println(this.getClass().getSimpleName()+" object is created");
		
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public int getMetroNum() {
		return metroNum;
	}

	public void setMetroNum(int metroNum) {
		this.metroNum = metroNum;
	}

	public int getPlatFormNum() {
		return platFormNum;
	}

	public void setPlatFormNum(int platFormNum) {
		this.platFormNum = platFormNum;
	}

	@Override
	public String toString() {
		return "MetroDTO [startPoint=" + startPoint + ", endPoint=" + endPoint + ", MetroNum=" + metroNum
				+ ", platFormNum=" + platFormNum + "]";
	}
	@Override
	public int hashCode() {
		return metroNum;
	}
	@Override
	public boolean equals(Object o) {
		MetroDTO dto=(MetroDTO)o;
		if(this.startPoint== dto.startPoint)
		return true;
		
		return false;
	}
	

}
