import java.util.Scanner;
public class posnegnumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		if(n>0)
		{
			System.out.println("positive number");
		}
		else if(n<0)
		{
			System.out.println("negative number");
		}
		else
		{
			System.out.println("Equallnt to zero 0");
		}
	}

}
