// prime b/w to numbers
// input first number 10
// input second number 20
//prime numbers ---> 11 13 17 19

import java.util.Scanner;

public class allprime {
    public static void main(String[] args) {

        int i,j;
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(i=n1  ; i<=n2 ; i++)
        {
            for(j=2 ; j<=i ; j++)
            {
                if(i%j==0)
                    break;
            }
            if(i==j)
            {
                System.out.println(j);
            }
        }

    }
}
