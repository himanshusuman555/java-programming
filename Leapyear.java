// leap year program 
// 1.century (100%= 0 and 400%=0) 2000 2400 diff is 4 years        not-->1700 1800 1900
// 2.yearly (100%!=0 and 4%=0) 2020 2024     not -- 2021 2022 2024
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args)
	{
		int y;
		System.out.println("Enter any year:");
		Scanner sc = new Scanner(System.in);
		y = sc.nextInt();
		
		if(y%100 ==0 && y%400 ==0 || y%100!=0  && y%4 ==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("Not leap year");
		}

	}

}
