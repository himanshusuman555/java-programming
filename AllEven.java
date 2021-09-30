import java.util.Scanner;
public class AllEven {
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of terms: ");
		n = sc.nextInt();
		
		for(int i=0; i<=n ; i= i+2)
		{
			System.out.println(i);
		}
	}

}
