
public class OnRoadCarPrice {

	public static void main(String[] args) {
		String carName = "Verna";
		int cc = 2800;
		int price = 3375000;
		float tax = 0.0f;
		int insurance = 0;
		
		if(price < 1000000) {
			tax = 17.0f;
		}
		
		if(price >= 1000000 && price < 1500000) {
			tax = 23.0f;
		}
		
		if(price >= 1500000 && price < 2500000) {
			tax = 27.0f;
		}
		
		if(price >= 2500000) {
			tax = 31.0f;
		}
		
		// Get insurance for 1 year based on cc
		if( cc < 1000) {
			insurance = 2399;
		}
		if( cc >= 1000 && cc <2000) {
			insurance = 3799;
		}
		if( cc >= 2000 && cc <3000) {
			insurance = 5999;
		}
		if( cc >= 3000) {
			insurance = 7299;
		}
	
		
		// Insurance amount for 5 years time period
		int insuranceAmountFor_5_Years = insurance * 5;
		
		// Get total price by including tax amount
		float taxAmount = price * (tax/100);
		
		float onRoadPrice = price + taxAmount + insuranceAmountFor_5_Years;
		
		System.out.println("Car Name: "+carName);
		System.out.println("CC: "+cc);
		System.out.println("Price: "+price);
		System.out.println("Tax in %: "+tax);
		System.out.println("Tax amount: "+taxAmount);
		System.out.println("Insurance/Year: "+insurance);
		System.out.println("Iinsurance/5 years: "+insuranceAmountFor_5_Years);
		System.out.println("On Road Price: "+onRoadPrice);
		
		
		
		

	}

}
