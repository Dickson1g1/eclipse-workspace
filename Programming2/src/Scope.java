
public class Scope {
	private static int x =1; //static 

	public static void main(String[] args) {
		
		int x = 5; //local variable
		
		System.out.println(x);
		
		useLoacalvariable();
		useField();
		useLoacalvariable();
		useField();
		
		System.out.println(x);
	}

	private static void useLoacalvariable() {
		int x = 25;
		
		System.out.println(x);
	    ++x;
	    System.out.println(x);
	}

	private static void useField() {
		System.out.println(x);
		x *= 10;
		System.out.println(x);
		
		
	}

}
