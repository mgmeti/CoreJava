
public class Qualification {

	public static void main(String[] args) {

		int yop = 2025;
		int qCode = 5;
		int sCode = 2;
		float perc = 66.4f;
		int flag = 0;
		
		
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
