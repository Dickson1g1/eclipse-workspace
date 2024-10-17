
public class AccountTest {

	public static void main(String[] args) {
		Account myAccount = new Account();
		
		String s1 = myAccount.getName();
		System.out.println( s1 );
		
		myAccount.setName("Jane Green");
		
		String s2 = myAccount.getName();
		System.out.println( s2 );

	}

}
