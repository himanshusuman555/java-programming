//area of cicle = PI * r * r
// PI = 22/7 or 3.14

import java.util.Scanner;

public class Areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    final double PI = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radious : ");
		final double radious = sc.nextDouble();
		
		final double areaofcicle = PI * radious * radious;
		System.out.println(areaofcicle);
	}

}
