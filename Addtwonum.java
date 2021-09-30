import java.util.Scanner;
public class Addtwonum {
	public static void main(String args[])
	{
		System.out.println("Enter two numbers");
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		int sum = a+b;
		System.out.println("Sum = " +sum);
	}

}
