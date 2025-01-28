
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		String s = getFactorail(n);
		
		System.out.println(s);
	}
	
	public static String getFactorail(int num) {
		
		String s = "";
		
		int fact = 1;
		
		if (num > 0) {
			for (int n = 1; n<= num; n++) {
				fact = fact * n;
			}
		}
		
		String s = num + " factorail is " + fact;
		
		return s;
	}

}
