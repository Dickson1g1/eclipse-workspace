import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); 
        int accountNumber = 0; 
        int balance = 0; 
        int totalCharges = 0; 
        int totalCredits = 0; 
        int creditLimit = 0; 

       
        while (true) {
            System.out.print("Enter account number (or -1 to quit): ");
            accountNumber = inp.nextInt(); 

            // Sentinel value to exit the loop
            if (accountNumber == -1) {
                break; 
            }

            System.out.print("Enter balance at the beginning of the month: ");
            balance = inp.nextInt(); 

            System.out.print("Enter total charges this month: ");
            totalCharges = inp.nextInt(); 

            System.out.print("Enter total credits this month: ");
            totalCredits = inp.nextInt(); 

            System.out.print("Enter allowed credit limit: ");
            creditLimit = inp.nextInt(); 

            // Calculate the new balance
            int newBalance = balance + totalCharges - totalCredits;

            // Display the new balance
            System.out.printf("New balance for account %d: %d%n", accountNumber, newBalance);

            // Check if the new balance exceeds the credit limit
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            } else {
                System.out.println("Credit limit not exceeded.");
            }
        }

       
    }
}