import java.util.Scanner;

public class powerofn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Enter the power");
		int m = sc.nextInt();
		
		for(int i=1;i<=m;i++)
		{
			result = result * n;
		}
		System.out.println(result);
	}

}
