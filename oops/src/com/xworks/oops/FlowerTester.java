package com.xworks.oops;

import com.xworks.oops.encapsulation.FlowerDTO;

public class FlowerTester {
	public static void main(String [] ar) {
	
	FlowerDTO hibiscus=new FlowerDTO();
	
	String name=hibiscus.getName();
	System.out.println(name);
	hibiscus.setName("Hibiscus");
	String nameb=hibiscus.getName();
	System.out.println(nameb);
	
	hibiscus.setColour("it can be in waries colour White to Pink,Red,Blue,Orange,Peach,Yellow or Purple");
	String col=hibiscus.getColour();
	System.out.println(col);
	
	hibiscus.setKingdom("kingdom: Plantae");
	String plant=hibiscus.getKingdom();
	System.out.println(plant);
	
	hibiscus.setSeason("Mid to Late Summer");
	String season=hibiscus.getSeason();
	System.out.println(season);
	
	hibiscus.setNumberOfPetals(11);
	int petal=hibiscus.getNumberOfPetals();
	System.out.println(petal);
	
	hibiscus.setNumberOfSepals(5);
	int sepal=hibiscus.getNumberOfSepals();
	System.out.println(sepal);
	
	hibiscus.setSeedExistence("we can Existence in Hibiscus");
	String seed=hibiscus.getSeedExistence();
	System.out.println(seed);
	
	hibiscus.setPurpose("To Treat Conditions such as Cancer and Gallbladder attacks, To Lower Blood Pressre");
	String pur=hibiscus.getPurpose();
	System.out.println(pur);
	
	hibiscus.setPrice(350);
	int prc=hibiscus.getPrice();
	System.out.println(prc);
		
	}

}
