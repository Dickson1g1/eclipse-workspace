import java.util.ArrayList;

public class ArrayListCollection2 {

	public static void main(String[] args) {
			ArrayList<String> items = new ArrayList<String>();
			
			items.add("white");
			items.add("blue");
			display(items);
			items.add(0, "red");
			display(items);
			
			items.add("green");
			items.add("purple");
			display(items);
			System.out.println(items.size());
			
			System.out.println("contains green?" + items.contains("green"));
			items.remove("green"); 
			System.out.println("contains green?" + items.contains("green"));
			
			items.remove(3); 
			display(items);
	}

	public static void display(ArrayList<String> items) {
		for (String e : items)  {
			System.out.printf("%s ", e);
		}
		System.out.println();
	}
}

