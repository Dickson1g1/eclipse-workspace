import java.util.Scanner;

public class AddingUserInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Give me a number");
		int num1 = inp.nextInt();
		
		System.out.println("Give me another number");
		int num2 = inp.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("The answer is ");
		System.out.println(sum);
	}

}
