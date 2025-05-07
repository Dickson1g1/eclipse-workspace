import java.util.Scanner;

public class FindTwoLargestNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); 
        int largest = 0; 
        int secondLargest = 0; 
        int counter = 0; 
        int number = 0; 

        
        while (counter < 10) {
            System.out.print("Enter an integer: ");
            number = inp.nextInt(); 

            
            if (number > largest) {
                secondLargest = largest; 
                largest = number; 
                }
            
            if (number > secondLargest);{
            	
            }
            else {
            	number != largest;
            }


//                
//                if (number > largest) {
//                    
//                    secondLargest = largest; 
//                    largest = number; 
//                } else if (number > secondLargest && number != largest) {
//                    secondLargest = number; 
//                }

            counter++; 
        }

        System.out.printf("The largest number is: %d%n", largest);
        System.out.printf("The second largest number is: %d%n", secondLargest);
    }
 }
