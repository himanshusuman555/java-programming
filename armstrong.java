// 153 == 1*1*1 + 5*5*5 + 3*3*3
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {

        int c,n,rem,arm=0 ;
        System.out.println("Enter any number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c =n;
        while(n>0)
        {
            rem = n % 10;
            arm = (rem * rem * rem) + arm;
            n = n/10;

        }
        if(c == arm)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
