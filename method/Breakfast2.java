class Breakfast2{
	public static void main(String[] ar){
		float result=breakFast( " dosa " , 45.5f, 10, 5 );
			System.out.println(result);
		float responce=breakFast("idli " , 30.22f, 15, 10);
			System.out.println(responce);
		
			
      }
	static float breakFast(String name, float price, int quantity,int num){
		float total= price*quantity;
		float totalprice= price*quantity;
		float avr=total/num;
		float avr2=totalprice/num;
	
	  System.out.println("total price for " + name +" is " + total);
		
		
			return avr2;
    
		
      }

	
}