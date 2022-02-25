class Laptop {
	public static void main(String [] suchi){
		lapFeatures();
		Laptop.lapFeatures();
		double gowda=Laptop.getPrice();
			System.out.println(gowda);
		float sg=Laptop.marks();
			System.out.println(sg);
	}
	static void lapFeatures(){
		System.out.println("dell");
		System.out.println("lenovo");
	}
	static double getPrice(){
	double s = 50.76000;
	return s;
	
	}
	static float marks(){
		float sixthsem=8.23f;
		return sixthsem;
	}

}