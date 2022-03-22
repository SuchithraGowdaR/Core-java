package com.xworks.socialmediaapp.dto;

public class CourtCaseDTO {
	public int sectionNum;
	public int caseNum;
	public String typeOfCase;
	
	public CourtCaseDTO() {
		System.out.println(this.getClass().getSimpleName()+" Object is created");
		
	}

	public int getSectionNum() {
		return sectionNum;
	}

	public void setSectionNum(int sectionNum) {
		this.sectionNum = sectionNum;
	}

	public int getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(int caseNum) {
		this.caseNum = caseNum;
	}

	public String getTypeOfCase() {
		return typeOfCase;
	}

	public void setTypeOfCase(String typeOfCase) {
		this.typeOfCase = typeOfCase;
	}

	@Override
	public String toString() {
		return "CourtCaseDTO [sectionNum=" + sectionNum + ", caseNum=" + caseNum + ", typeOfCase=" + typeOfCase + "]";
	}
	@Override
	public int hashCode() {
		return caseNum;
	}
	@Override
	public boolean equals(Object o) {
		CourtCaseDTO dto=(CourtCaseDTO)o;
		if(this.typeOfCase== dto.typeOfCase);
		return true;
	}
	
}
