import java.util.ArrayList;

public class TheArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("yellow");
		items.add("red");
		
//		for (String item : items)  {
//			System.out.println(item);
//		}
		
		items.add("Green");
		items.add("Yellow");
		
//		for (String item : items)  {
//			System.out.println(item);
//		}
		
		items.remove("yellow");
		items.remove(1);
		
		for (String item : items)  {
			System.out.println(item);
		}
		
		System.out.print(items.size());
	}

}
