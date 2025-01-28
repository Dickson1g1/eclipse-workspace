
public class Quad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 1.0;
		double b = -5.0;
		double c = 6.0;
		
		String s = solveQuad(a, b, c);
		System.out.print(s);
		
	}
	
	public static String solveQuad(double a, double b, double c) {
		String s = "";
		
		double disc = (b*b) - (4*a*c);
		
		if (disc < 0) {
			s = "There are no real root.";
		}
		else {
			double d2 = Math.sqrt(disc);
			
			double r1 = (-b + d2) / (2 * a);
			double r2 = (-b + d2) / (2 * a);
			
			s = "The roots are " + r1 + "and " + r2;
		
		}
		return s;
		
	}
}
