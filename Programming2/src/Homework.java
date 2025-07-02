
public class Homework {

	public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) { // Fill in the blank to control the number of '+' printed
                System.out.print("+");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

}

// j <= i - This controls how many + symbols are printed in each row based on the current row number i.