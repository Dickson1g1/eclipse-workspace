import java.util.Scanner;

public class TheSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Please give me a number from 1 to 7");
		int day = inp.nextInt();
		
		String sDay = "";
		switch (day) {
		case 1:
			sDay = "Monday";
			break;
		case 2:
			sDay = "Tuesday";
			break;
		case 3:
			sDay = "Wednesday";
			break;
		case 4:
			sDay = "Thursday";
			break;
		case 5:
			sDay = "Friday";
			break;
		case 6:
			sDay = "Saturday";
			break;
		case 7:
			sDay = "Sunday";
			break;
		default:
			sDay = "Try again.";
		
		}
	}

}
