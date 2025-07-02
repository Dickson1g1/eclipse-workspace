
public class CommEmpTest {

	public static void main(String[] args) {
		CommEmp e = new CommEmp("Sue", "Jones", "222-22-2222", 10_000, .06);
		
		// Before. 
		System.out.println(e);
		
		e.setGrossSales(5_000);
		e.setCommissionRate(.1);
		
		// After.
		System.out.println(e);

	}

}
