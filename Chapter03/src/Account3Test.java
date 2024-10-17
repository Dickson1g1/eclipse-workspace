
public class Account3Test {

	public static void main(String[] args) {
		Account3 acc = new Account3("Jane Java", 100.0);
		
		System.out.printf("%s-- %.2f%n", acc.getName(), acc.getBalance());
		
		acc.deposit(900.0);
		
		System.out.printf("%s-- %.2f", acc.getName(), acc.getBalance());
	}

}
