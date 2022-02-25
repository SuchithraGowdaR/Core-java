class Breakfast{
	static void breakfast(){
		System.out.println(" i had tiffen ");
	}
	
	static void breakFast(String name){
		System.out.println(" i eaten " + name );
	}

	static void breakFast(float price){
		System.out.println(" price is " + price );
	}

	static void breakFast(String name,float price){
		System.out.println("i eaten " + name + " price is " + price);
	}

	static void breakFast(String name,float price,String isittasty){
		System.out.println("i eaten "+ name + " price is " + price + " it's tasty " + isittasty);
	}
	
	static float breakFast(String name, float price, int quantity){
		float total= price*quantity;
		System.out.println("total price for " + name +" is " + total);
		return total;
		
	}

	public static void main(String[] ar){
		breakfast();
		breakFast("dosa");
		breakFast(50);
		breakFast("dosa" , 50 );
		breakFast("dosa" , 50 , "dosa");
		float result=breakFast("dosa" , 50 , 2);
			System.out.println(result);
	}
	
	
}