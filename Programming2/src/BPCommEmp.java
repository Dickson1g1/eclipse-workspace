
public class BPCommEmp extends CommEmp{
	private double baseSalary;
	
	public BPCommEmp(String first, String last, String ssn,
			double grossSales, double commissionRate, 
			double baseSalary) {
		
		super(first, last, ssn, grossSales, commissionRate);
		
		this.baseSalary = baseSalary; 
	}
	
	public void setBaseSalary(double baseSalary) {this.baseSalary = baseSalary;}
	public double getBaseSalary() {return baseSalary;}
	
	@Override
	public double earnings() {return getBaseSalary() + super.earnings();} 
	
	@Override
	public String toString() {
		return String.format("%s %.2f", 
							super.toString(), getBaseSalary()); 
		
	}
	

}
