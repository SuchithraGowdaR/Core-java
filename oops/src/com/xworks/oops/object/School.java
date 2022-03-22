package com.xworks.oops.object;

public class School {
	public String sclName;
	public long pnNum;
	public String learningBenefits;
	public School(){
		System.out.println("Invoking defoult School Constructor");
	}
	public School(String sclName) {
		System.out.println("Invoking single param School Constructor");
		this.sclName=sclName;
	}
	public School(String sclName,long pnNum,String learningBenefits) {
		this(sclName);
		System.out.println("Invoking three param School Constructor");
		this.pnNum=pnNum;
		this.learningBenefits=learningBenefits;
	}
	@Override
	public String toString() {
		return "School[School Name- "+sclName+"\t Phon Number- "+pnNum+"\tLearning Benefits- "+learningBenefits;
	}
}
