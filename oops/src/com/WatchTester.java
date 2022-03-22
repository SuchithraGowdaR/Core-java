package com;

import  com.xworks.oops.inheritance.SmartWatch;
import com.xworks.oops.inheritance.DigitalWatch;

public class WatchTester {
	public static void main(String []ar) {
	SmartWatch	swatch=new SmartWatch();
	swatch.wear();
	swatch.showTime();
	swatch.cllaing();
	swatch.steAlaram("2pm");
	swatch.watch("Bout","Black","Square",(float) 3000.5);
	swatch.sWatch(4, (byte) 5);
	
	
	DigitalWatch dwatch=new DigitalWatch();
	dwatch.wear();
	dwatch.showTime();
	dwatch.setAlaram("4am");
	dwatch.setTimmer(01, 25);
	dwatch.watch("Bout","Black","Square",(float) 3000.5);
	dwatch.dWatch((byte) 4, "LED");
	
		
	}

}
