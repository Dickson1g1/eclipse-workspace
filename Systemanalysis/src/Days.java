import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Please give me a number from 1 to 7");
		int x = inp.nextInt();
		
		if (x == 1) {
			System.out.println("Monday.");
		}
		
		else if (x == 2) {
			System.out.println("Tuesday");
		}
		
		else if (x == 3) {
			System.out.println("Wedneasday");
		}
		
		else if (x == 4){
			System.out.println("Thursday");
		}
		
		else if (x == 5){
			System.out.println("Friday");
		}
		
		else if (x == 6){
			System.out.println("Saturday");
		}
		
		else if (x == 7){
			System.out.println("Sunday");
		}
		
		else {
			System.out.println("Error");
		}
	}


}
