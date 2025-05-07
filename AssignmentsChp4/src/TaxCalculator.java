import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); 
        
        final double TAX_RATE_1 = 0.15; 
        final double TAX_RATE_2 = 0.20; 
        final double INCOME_THRESHOLD = 30000.0; 

        int counter = 1; 

        while (counter <= 3) {
        	System.out.printf("Enter the name of citizen %d: ", counter);
            String name = inp.nextLine(); 

            System.out.printf("Enter the earnings of %s: ", name);
            double earnings = inp.nextDouble(); 
            inp.nextLine(); 

            // Calculate tax
            double tax;
            if (earnings <= INCOME_THRESHOLD) {
                tax = earnings * TAX_RATE_1; // Calculate tax for earnings up to 30,000
            } else {
                tax = earnings * TAX_RATE_2; // Calculate tax for earnings above 30,000
//            	(INCOME_THRESHOLD * TAX_RATE_1) + ((earnings - INCOME_THRESHOLD) * TAX_RATE_2); 
            }

            
            System.out.printf("Total tax for %s: $%.2f%n", name, tax);

            counter++; // Increment the counter
        }

    }
}