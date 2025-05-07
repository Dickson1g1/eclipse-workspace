import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); 
        
        double[] itemValues = {239.99, 129.75, 99.95, 350.89};
        double baseSalary = 200.00; 
        double commissionRate = 0.09; 

        // Variables to hold the total sales
        double totalSales = 0.0;

        // Input the number of each item sold
        System.out.print("Enter the number of item 1 sold ($239.99): ");
        int item1Sold = inp.nextInt();
        totalSales = totalSales + (item1Sold * itemValues[0]); 

        System.out.print("Enter the number of item 2 sold ($129.75): ");
        int item2Sold = inp.nextInt();
        totalSales = totalSales + (item2Sold * itemValues[1]); 

        System.out.print("Enter the number of item 3 sold ($99.95): ");
        int item3Sold = inp.nextInt();
        totalSales = totalSales + (item3Sold * itemValues[2]); 

        System.out.print("Enter the number of item 4 sold ($350.89): ");
        int item4Sold = inp.nextInt();
        totalSales = totalSales + (item4Sold * itemValues[3]); 

        // Calculate total earnings
        double commission = totalSales * commissionRate;
        double totalEarnings = baseSalary + commission;

        // Display the results
        System.out.printf("Total sales: $%.2f%n", totalSales);
        System.out.printf("Total earnings: $%.2f%n", totalEarnings);

    }
}