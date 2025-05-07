
public class MethodOverload {

	public static void main(String[] args) {
		System.out.println(square(7));
		System.out.println(square(7.5));

	}

	private static int square(int n) {
		
		return n * n;
	}
	
	private static double square(double d) {
		
		return d * d;
	}

}
