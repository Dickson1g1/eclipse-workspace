
public class PassArray2 {
	 public static void main(String[] args) {
		 int[] a = {1,2,3,4,5};
		 
		 for (int e : a) {
			 //System.out.printf("%d", e);
			 System.out.print(e + " ");
		 }
		 System.out.println();
		 modifyArray(a);
		 for(int e : a) {
			 System.out.printf("%d ", e);
		 }
		 System.out.println("\n");
		 System.out.println(a[3]);
		 modifyElement(a[3]);
		 System.out.println(a[3]);
		 
	 }

	 public static void modifyArray(int[] arr) {
		 for(int n=0; n< arr.length; n++) {
			 arr[n] = arr[n]*2;
		 }
		 
	 }
	 public static void modifyElement(int e) {
		 e = e * 2; 
		 }
}
