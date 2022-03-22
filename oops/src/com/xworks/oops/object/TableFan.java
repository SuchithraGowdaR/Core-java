package com.xworks.oops.object;

public class TableFan extends Fan {
	public int numOfButtons;
	public String name;
	public String tFancolor;
	
	public TableFan() {
		System.out.println("Invoking default Tabalefan Constructor ");
	}
	public TableFan(int numOfButtons) {
		System.out.println("Invoking single param Tabalefan Constructor");
		this.numOfButtons=numOfButtons;
	}
	public TableFan(int numOfButtons,String name,String tFancolor ) {
		
		super((byte)5,"ushaa","black");
		
		System.out.println("Invoking three param Tabalefan Constructor");
		this.name=name;
		this.tFancolor=tFancolor;
	}
	

}
