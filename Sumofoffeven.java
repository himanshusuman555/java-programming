import java.util.Scanner;
public class Sumofoffeven {
	public static void main(String args[])
	{
		int n , evensum = 0,oddsum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of terms: ");
		n = sc.nextInt();
		
		for(int i =0; i <=n ; i++)
		{
			if(i % 2 ==0)
			{
				System.out.println("Even value =" +i);
			  evensum = evensum + i;
			}
			else
			{
				System.out.println("Odd value = |"+i);
				oddsum = oddsum + i;
			}
			
		}
		System.out.println("Even sum =" + evensum);
		System.out.println("Odd sum = " + oddsum);
	}

}
