// A Java class to determine candidates' qualifications against given dummy company requirements.
// Usage of else-if ladder and '!=' not equal to comparator can be seen here :)
// Flag and else-if both can be used to determine eligibility.

public class Qualification {

	public static void main(String[] args) {

		int yop = 2025;
		int qCode = 5;
		int sCode = 2;
		float perc = 66.4f;
		int flag = 0;

		//check for eligibility of the given candidate		
		if(perc< 50) {
			System.out.println("Not eligible");			
		}else if(yop != 2022 && yop != 2023 && yop != 2024) {
			System.out.println("Not eligible");		
			
		}else if(qCode != 1 && qCode != 3 && qCode != 4) {
			System.out.println("Not eligible");
			
		}else if(sCode != 1 && sCode != 2 && sCode != 4) {
			System.out.println("Not eligible");
			
		}else {
			System.out.println("Eligible");
		}
		

		//Print separately not matching requirements 
		if(perc < 50) {
			flag =1;
			System.out.println("Parcentage not matching");
		}
		if(yop != 2022 && yop != 2023 && yop != 2024) {
			flag = 1;
			System.out.println("YOP not matching");
		}
		if(qCode != 1 && qCode != 3 && qCode != 4) {
			flag =1;
			System.out.println("Qualification not matching");
		}
		if(sCode != 1 && sCode != 2 && sCode != 4) {
			flag = 1;
			System.out.println("Stream not matching");
		}
		
		if(flag == 0){
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not eligible");
		}
		
	}

}
	
	
	
	class QualificationAny{
	public static void main(String[] args) {
		int qCode = 2;
		int sCode = 1;
		int yop = 2024;
		float perc = 65.0f;
		float minPerc = 60.0f;
		
		
		if(qCode == 2 || qCode == 4 || qCode == 6) {
			minPerc = 70.0f;
		}
		
		if(perc < minPerc || yop< 2020 || yop > 2024) {
			System.out.println("Not Eligible");
		}
		else {
			System.out.println("Elibile");
		}
		
		if(perc < minPerc) {
			System.out.println("Percentge Not Matching");
		}
		if(yop< 2020 || yop > 2024) {
			System.out.println("Percentge Not Matching");
		}
	}
}
