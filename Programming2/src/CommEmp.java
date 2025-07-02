
public class CommEmp extends Object {
	private final String first;
	private final String last;
	private final String ssn;
	private double grossSales;
	private double commissionRate; 
	
	public CommEmp(String first, String last, String ssn,
			double grossSales, double commissionRate) {
		
		//implicit call to object's default cstr occurs here. 
		
		this.first = first;
		this.last = last;
		this.ssn = ssn;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		
	}
	
	public String getFirst() {return first;}
	public String getLast() {return last;}
	public String getSsn() {return ssn;}
	public void setGrossSales(double grossSales) {this.grossSales = grossSales;}
	public double getGrossSales() {return grossSales;}
	public void setCommissionRate(double commissionRate) {this.commissionRate = commissionRate;}
	public double getCommissionRate() {return commissionRate;}
	
	public double earnings() {return commissionRate * grossSales;}
	
	@Override
	public String toString() {
		return String.format("%s %s %s %.2f %.2f ", 
							first, last, ssn, grossSales, commissionRate); 
		
	}



}
