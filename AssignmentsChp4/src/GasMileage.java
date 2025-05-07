import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); 
        int totalMiles = 0; 
        int totalGallons = 0; 
        int tripCount = 0; 

        while (true) {
            System.out.print("Enter miles driven for the trip (or -1 to quit): ");
            int milesDriven = inp.nextInt(); 

            // Sentinel loop
            if (milesDriven == -1) {
                break; 
            }

            System.out.print("Enter gallons used for the trip: ");
            int gallonsUsed = inp.nextInt(); 

            // Calculate miles per gallon for the current trip
            double mpg = (double) milesDriven / gallonsUsed;
            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);

            // Update total miles and gallons
            totalMiles = totalMiles + milesDriven; // Update total miles by adding miles driven for the current trip
            totalGallons = totalGallons + gallonsUsed; // Update total gallons by adding gallons used for the current trip
            tripCount++; // Increment the trip count
        }

        // Calculate and show the total miles per gallon for all trips
        if (tripCount > 0) {
            double combinedMpg = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon for all trips: %.2f%n", combinedMpg);
        } else {
            System.out.println("No trips were entered.");
        }


    }
}