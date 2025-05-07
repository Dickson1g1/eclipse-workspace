import java.security.SecureRandom;

public class RollIt {

	public static void main(String[] args) {
		SecureRandom rnd = new SecureRandom();
		int f1 = 0;
		int f2 = 0;
		int f3 = 0;
		int f4 = 0;
		int f5 = 0;
		int f6 = 0;
		
		for (int n=1; n<= 60_000_000; n++) {
			int face = 1 + rnd.nextInt(6);
			
			switch (face) {
			case 1:
				f1++;
				break;
			case 2:
				f2++;
				break;
			case 3:
				f3++;
				break;
			case 4:
				f4++;
				break;
			case 5:
				f5++;
				break;
			case 6:
				f6++;
				break;
			}
		}
		System.out.printf("  %d%n  %d%n  %d%n  %d%n  %d%n  %d%n ", f1, f2, f3, f4, f5, f6);
	}

}
