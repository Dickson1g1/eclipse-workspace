import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); 
        int largest = 0; 
        int counter = 0; 
        int number = 0; 

        while (counter < 10) {
            System.out.print("Give me a number: ");
            number = inp.nextInt(); 

            if (number > largest) {
                largest = number; 
            }

            counter++; 
        }

        System.out.printf("The largest number is: %d%n", largest);
    }
}