//ASCII VALUE OF A CHARACTER
import java.util.Scanner;
public class ASciivalue {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter a character : ");
		ch = sc.next().charAt(0);
		
		int a=ch;     //implicit type casting ch is smaller than int
		System.out.println("Ascii value of "+ch+ "is : "+a);
	}

}
