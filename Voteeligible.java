import java.util.Scanner;
public class Voteeligible {
	public static void main(String args[])
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		
		if(age >= 18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("not eligible");
		}
	}

}
