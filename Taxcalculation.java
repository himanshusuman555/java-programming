// Tax calculation  
// input sal<=10000 ----> no tax
// input sal>= 10000 bt sal<=100000 ---> 10% tax
// input sal> 100000 ---> 20% tax

import java.util.Scanner;
public class Taxcalculation {
	public static void main(String args[])
	{
		int sal; double tax;	
		System.out.println("Enter salary : ");
		Scanner sc = new Scanner(System.in);
		sal = sc.nextInt();
		
		if(sal <= 10000)
		{
			System.out.println(sal + " No tax");
		}
		else if(sal>10000 && sal<=100000)
		{
			tax = sal*0.10;
			System.out.println("Salary ="+sal+ " ,tax = "+tax );
		}
		else
		{
		  tax = sal*0.20;
		  System.out.println(sal+ " " + tax);
		}
		
	}

}
