
public class BPCommEmpTest {

	public static void main(String[] args) {
			BPCommEmp e = new BPCommEmp("Bob", "Lewis", "333-33-333", 5_000, .04, 300);
			
			// Before. 
			System.out.println(e);
			
			e.setBaseSalary(1_000);
			
			// After.
			System.out.println(e);

		}

}

