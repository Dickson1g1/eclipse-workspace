import java.util.Arrays;

public class ArrayManipulations2 {

	public static void main(String[] args) {
		int[] a = {1,3,5,2,4};
		for (int e : a) {
			 System.out.printf("%d ", e);
			
		 }
		 System.out.println();
		 Arrays.sort(a);
		 for (int e : a) {
			 System.out.printf("%d ", e);
			 
		 }

		 System.out.println("\n");
		 int[] b = new int[5];
		 for (int e : b) {
			 System.out.printf("%d ", e); 
		 }
		 
		 System.out.println();
		 Arrays.fill(b, 7);
		 for (int e : b) {
			 System.out.printf("%d ", e); 
		 }
		 
		 System.out.println("\n");
		 int loc = Arrays.binarySearch(a,  5);
		 System.out.println(loc);
		 loc = Arrays.binarySearch(a,  75);
		 System.out.println(loc);
	}

}
