import java.util.Scanner;
import java.util.stream.IntStream;
public class calculator {
	public static void main(String args[])
	{
		int n1 , n2 ;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.println("Select operation : + - * % /");
		
		ch = sc.next().charAt(0);
		switch(ch)
		{
		case '+': System.out.println("sum = "+(n1 + n2));
		break;
		
		case '-': System.out.println("sub = "+(n1 - n2));
		break;

		case '*': System.out.println("mul = "+(n1 * n2));
		break;

		case '%': System.out.println("mod = "+(n1 % n2));
		break;

		case '/': System.out.println("div = "+(n1 /n2));
		break;
		
		default : System.out.println("Enter correct choice next time");

			
		
		}
		
	}

}
