// input 3465 ---> 4 digits
import java.util.Scanner;
public class DigitCOunt {
	public static void main(String args[])
	{
		int n,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		n = sc.nextInt();
		
		while(n>0)
		{
			n= n/10;
			count++;
		}
		System.out.println(" No. of digits : "+count);
		
	}

}
