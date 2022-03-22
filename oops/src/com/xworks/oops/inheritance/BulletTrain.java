package com.xworks.oops.inheritance;

public class BulletTrain extends NormalTrain {
	public String speed;
	public int operationdate;
	
	public BulletTrain() {
		
	}
	public void SpeedLine() {
		System.out.println("Japan's high speed line between Tokyoand Osaka");
		
	}
	public void benefits(String n,String w,String rd) {
		System.out.println("Benefits: "+n+w+rd);
	}
	public void bTrin(String speed, int operationdate) {
		this.speed=speed;
		this.operationdate=operationdate;
	}
}
