import java.util.Scanner;
public class squareroot {
    public static void main(String[] args) {

        int n;
        System.out.println("Enter any number");
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();

        double m = Math.sqrt(n);
        System.out.println("Square root of "+n+" is "+m);
    }
}
