import java.util.Scanner;

public class odd {
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter no of terms: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i =1; i<=n ; i=i+2)
		{
			System.out.println(i);
		}
		
	}

}
