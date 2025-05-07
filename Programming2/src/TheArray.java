
public class TheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 7;
		//System.out.println(7);
		
		int [] a = {2, 23, 5};
		//int[] a = new int[3];
		
		for (int n=0; n < a.length; n++) {
			System.out.println( a[n] );
		}
		
		for(int element : a) {
			System.out.println(element);
		}
		
	}

}
