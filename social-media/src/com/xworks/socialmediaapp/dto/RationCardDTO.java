package com.xworks.socialmediaapp.dto;

public class RationCardDTO {
	public String typeOfCard;
	public int numOfMembers;
	public int IdNum;
	
	public RationCardDTO(){
		System.out.println(this.getClass().getSimpleName()+" objrct is created");
		
	}

	public String getTypeOfCard() {
		return typeOfCard;
	}

	public void setTypeOfCard(String typeOfCard) {
		this.typeOfCard = typeOfCard;
	}

	public int getNumOfMembers() {
		return numOfMembers;
	}

	public void setNumOfMembers(int numOfMembers) {
		this.numOfMembers = numOfMembers;
	}

	public int getIdNum() {
		return IdNum;
	}

	public void setIdNum(int IdNum) {
		this.IdNum = IdNum;
	}

	@Override
	public String toString() {
		return "RationCardDTO [typeOfCard=" + typeOfCard + ", numOfMembers=" + numOfMembers + ", IDNum=" + IdNum + "]";
	}
	@Override
	public int hashCode() {
		return this.IdNum;
	}
	@Override
	public boolean equals(Object o) {
		RationCardDTO dto=(RationCardDTO)o;
		if(this.numOfMembers== dto.numOfMembers)
			return true;
		return false;
	}

}
