// palindrome = 121  / 131 / 151
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int n,r,p=0;
        System.out.println("Enter any numer");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int c = n;
        while(n>0)
        {
            r =n%10 ;     //121 % 10 = 1         // 12% 10 = 2        // 1%10 =1
            p = (p*10)+r;   //(0 * 10) + 1 = 1  // (1 * 10) + 2 = 12 //(12*10)+1 =121
            n = n/10;   // 121 / 10  = 12       //  12/10 = 1  // 1/10=0
        }
        if(c==p)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }

    }
}
