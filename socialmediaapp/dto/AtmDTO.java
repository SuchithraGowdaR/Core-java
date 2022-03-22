package com.xworks.socialmediaapp.dto;

public class AtmDTO {
	private String typeOfCard;
	private int limitation;
	private int cardNum;
	
	public AtmDTO() {
		System.out.println(this.getClass().getSimpleName()+" Object is created");
		
	}

	public String getTypeOfCard() {
		return typeOfCard;
	}

	public void setTypeOfCard(String typeOfCard) {
		this.typeOfCard = typeOfCard;
	}

	public int getLimitation() {
		return limitation;
	}

	public void setLimitation(int limitation) {
		this.limitation = limitation;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}

	@Override
	public String toString() {
		return "AtmDTO [typeOfCard=" + typeOfCard + ", limitation=" + limitation + ", cardNum=" + cardNum + "]";
	}
	@Override
	public int hashCode() {
		return cardNum;
	}
	@Override
	public boolean equals(Object o) {
		AtmDTO dto=(AtmDTO)o;
		if(this.cardNum== dto.cardNum)
			return true;
		return false;
		
	}

}
