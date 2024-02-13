
public class PriceOfPizza {

	public static void main(String[] args) {
		
		String  type = "Regular";
		int price = 149;
		boolean extraCheese = false;
		boolean toping_1 = true;
		boolean toping_2 = true;
		float GST = 18.0f/100;
		
		if(extraCheese) {
			price = price + 80;
		}		
		
		if( toping_1 == true && toping_2 == false) {
			price = price + 40;
		}
		else {
			price = price  + 70;
			
		};
		
		
		float totalPrice = price + (price * GST);
		
		System.out.println("Pizza Type: "+type);
		System.out.println("Price: "+price);
		System.out.println("Grand Total: "+totalPrice);

		if(extraCheese==true && toping_1 == true && toping_2 == true) {
			
			System.out.println("For loaded Pizza!!!");
			System.out.println("Get a Coke & Garlic Bread @99/- Only!!!");
		}

	}

}
