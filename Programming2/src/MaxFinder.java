import java.util.Scanner;

public class MaxFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 doubles:");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();

		double res = maximum(n1, n2, n3); 
		System.out.println(res);	
		
	}

	public static double maximum(double x, double y, double z) {
		double maxValue = x;
		if(y > maxValue) {
			maxValue =y;
		}
		if(z > maxValue) {
			maxValue =z;
		}
		
		return maxValue;
	}
}
