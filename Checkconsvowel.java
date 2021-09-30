//program to check consonent or vowel
import java.util.Scanner;
public class Checkconsvowel {
	public static void main(String args[])
	{
		char ch;
		System.out.println("Enter any character: ");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		
		if(ch =='a'|| ch =='e'|| ch == 'i'|| ch == 'o'||ch == 'u'|| ch == 'A'||ch =='E'|| ch == 'I'||ch == 'O'|| ch == 'U')
		{
			System.out.println("Its a vowel");
		}
		else
		{
			System.out.println("Its a consonent");
		}
	}

}
