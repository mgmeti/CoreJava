
public class PriceReciept {

	public static void main(String[] args) {
		String itemName = "MASAL-DOSA";
		int price = 70; //In Rupees
		int quantity = 15; // Number of orders
		float GST = 18.0f/100;

		int total = price * quantity;

		float gstTotal = total * GST;

		float grandTotal = total + gstTotal;

		System.out.println("Item: "+itemName);
		System.out.println("Price: Rs" +price);
		System.out.println("Quantity: Rs"+quantity);
		System.out.println("Total Amount: Rs"+total);
		System.out.println("GST Amount: Rs"+gstTotal);
		System.out.println("Grand Total: Rs"+grandTotal);


	}

}


class FruitPriceReciept{
	public static void main(String[] args) {
		
		String itemName = "Kiwi";
		int price = 345; // Per Kg
		int quantity = 750; //Grams
		float GST = 5.0f/100; //GST Extra
		
		// Get price per gram
		float pricePerGram = price /1000.0f;
		
		float total = price * pricePerGram;

		float gstTotal = total * GST;

		float grandTotal = total + gstTotal;

		

		System.out.println("Item: "+itemName);
		System.out.println("Price: Rs" +price);
		System.out.println("Quantity: Rs"+quantity);
		System.out.println("Total Amount: Rs"+total);
		System.out.println("GST Amount: Rs"+gstTotal);
		System.out.println("Grand Total: Rs"+grandTotal);
				
	}
}

class Discount{
	public static void main(String[] args) {
		int p1 = 499;
		int  p2 = 1299;
		int p3 = 799;
		int p4 = 149;
		float discount = 15.0f/100;
		
		
		int total = p1 + p2 +p3 + p4;
		
		float discountTotal = total * discount;
		
		float grandTotal = total - discountTotal;
		
		System.out.println("Total amount: Rs "+total);
		System.out.println("Amount Saved: Rs "+discountTotal);
		System.out.println("Grand Total: Rs "+grandTotal);
		
	}
}
