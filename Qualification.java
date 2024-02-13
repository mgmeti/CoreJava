
public class Qualification {

	public static void main(String[] args) {

		int yop = 2022;
		int qCode = 1;
		int sCode = 4;
		float perc = 65.4f;
		
		if(perc < 50) {
			System.out.println("Not");
		}
		if(yop != 2022 && yop != 2023 && yop != 2024) {
			System.out.println("Not");
		}
		if(qCode != 1 && qCode != 3 && qCode != 4) {
			System.out.println("NOt");
		}
		if(sCode != 1 && sCode != 2 && sCode != 4) {
			System.out.println("Not");
		}
		else {
			System.out.println("Eligible");
		}
		
	}

}
