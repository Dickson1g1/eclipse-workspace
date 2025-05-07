
public class Logic {

	public static void main(String[] args) {
		boolean a, b;
		
		//AND:
		a = true;
		b = true;
		System.out.printf("%b  && %b ----> %b%n", a, b, (a && b));
		
		a = true;
		b = false;
		System.out.printf("%b  && %b ----> %b%n", a, b, (a && b));
		
		a = false;
		b = true;
		System.out.printf("%b && %b ----> %b%n", a, b, (a && b));
		
		a = false;
		b = false;
		System.out.printf("%b && %b ----> %b%n", a, b, (a && b));
		
		System.out.println();
		
		
		//OR
		
		a = true;
		b = true;
		System.out.printf("%b  || %b ----> %b%n", a, b, (a || b));
		
		a = true;
		b = false;
		System.out.printf("%b  || %b ----> %b%n", a, b, (a || b));
		
		a = false;
		b = true;
		System.out.printf("%b || %b ----> %b%n", a, b, (a || b));
		
		a = false;
		b = false;
		System.out.printf("%b || %b ----> %b%n", a, b, (a || b));
		
		System.out.println();
		
		//NOT
		
		a = true; 
		System.out.printf("!%b  ----> %b%n", a, (!a));
		
		a = false; 
		System.out.printf("!%b ----> %b%n", a, (!a));
		

	}

}
