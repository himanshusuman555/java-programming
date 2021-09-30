import java.util.Scanner;
public class Arithop {
	public static void main(String args[])
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		System.out.println("Summition = " + (a+b));
		System.out.println("subtraction = " + (a-b));
		System.out.println("mul = " + (a*b));
		System.out.println("divide = " + (a/b));
		System.out.println("mod = " + (a%b));
	}

}
