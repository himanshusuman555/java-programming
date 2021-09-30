import java.util.Scanner;
public class avof5mark {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 5 subject : ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		int e= sc.nextInt();
		
		double avg = ((a+b+c+d+e)/5);
		System.out.println(avg);
	}
	

}
