import java.util.Scanner;

public class areaoftraingle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of triangle:");
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();
		// sp = semiperimeter
		
		double sp = (side1 +side2 + side3)/2;
		double area = Math.sqrt(sp*(sp-side1) * (sp-side2) * (sp-side3) );
		
		System.out.println(area);
	}

}
