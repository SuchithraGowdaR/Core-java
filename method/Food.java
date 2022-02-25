class Food{
	static void breakFast(){
		System.out.println( "having breakfat");
	}

	static void breakfast(String  name){
		System.out.println( name +"having");
	}

	static void breakFast(float price){
		System.out.println("price is "+price);
	}
	
	static void breakFast(String name , float price){
		System.out.println(name+ "having"+ "price is"+price);
	}

	public static void main(String[] ar){
			breakFast();
			breakfast(" pulav ");
			breakFast(40);
			 breakFast("idli",30);
	}

}