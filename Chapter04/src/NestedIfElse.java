import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int x = 85;
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Please give me a number");
		int x = inp.nextInt();
		
		if (x >= 90) {
			System.out.println("In the 90's.");
		}
		
		else if (x >= 80) {
			System.out.println("In the 80's.");
		}
		
		else if (x >= 70) {
			System.out.println("In the 70's.");
		}
		
		else {
			System.out.println("Less than 70.");
		}
	}

}
