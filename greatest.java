import java.util.Scanner;
public class greatest {
	public static void main(String args[])
	{
		int a=20,b=20,c=30;
		int max = (a>b) ? (a>c ? a :c) : (b>c ? b : c);
		System.out.println(max);
	}

}
