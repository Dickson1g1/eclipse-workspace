import java.security.SecureRandom;

public class RandIntegers {

	public static void main(String[] args) {
		SecureRandom rnd = new SecureRandom();
		
		for (int n=1; n<=90; n++) {
			int face = 1 + rnd.nextInt(6);
			System.out.printf("%d ", face);
			if (n % 10 == 0) {
				System.out.println();
			}
		}

	}

}
