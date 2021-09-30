import java.util.Scanner;

public class Switchname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the weekend day no.");
		int n = sc.nextInt();
		switch(n)
		{
		case 1: System.out.println("Monday"); break;
		
		case 2: System.out.println("Tuesday"); break;
		
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Fri"); break;
		case 6: System.out.println("SAt"); break;
		case 7: System.out.println("Sunday"); break;
		
		default : System.out.println("Invalid");
		
		
		
		
		
		}
		
	}

}
