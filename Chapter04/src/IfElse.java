import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x = 0;
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Please give me a number");
		int x = inp.nextInt();
		
		if (x > 0) {
			System.out.println("X is greater than 0.");
		}
		
		else {
			System.out.println("X is NOT greater than 0.");
		}
	}

}
