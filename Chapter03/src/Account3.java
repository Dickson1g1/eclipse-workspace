
public class Account3 {
	private String name; // instance variable. 
	private double balance; // instance variable.
	
	public Account3(String n, double b) { // constructor 
		this.name = n;
		this.balance = b;
	}
	
	public void deposit( double depositAmount ) {
		balance = balance + depositAmount;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}

}



