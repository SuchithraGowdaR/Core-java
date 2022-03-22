package com.xworks.socialmediaapp.dto;

public class GymDTO {
	public String startTime;
	public String endTime;
	public int numOfInstruments;
	public String trainerName;
	
	public GymDTO() {
		System.out.println(this.getClass().getSimpleName()+" Object is created");
		
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getNumOfInstruments() {
		return numOfInstruments;
	}

	public void setNumOfInstruments(int numOfInstruments) {
		this.numOfInstruments = numOfInstruments;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	@Override
	public String toString() {
		return "GymDTO [startTime=" + startTime + ", endTime=" + endTime + ", numOfInstruments=" + numOfInstruments
				+ ", trainerName=" + trainerName + "]";
	}
	@Override
	public int hashCode() {
		return  numOfInstruments;
	}
	@Override
	public boolean equals(Object o) {
		GymDTO dto2=(GymDTO)o;
		if(this.startTime==dto2.startTime)
			return true;
		
		return false;
	}
	
}
