import java.util.Scanner;
public class Charinput {
	public static void main(String args[])
	{
		char ch;
		System.out.println("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		ch= sc.next().charAt(0);
		System.out.println(ch);
	}

}
