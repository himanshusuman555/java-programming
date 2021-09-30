// perfect number
// input number 6 ---> 1 2 3 4 5
// 6 ----> 1+2+3 = 6
import java.util.Scanner;
public class perfectnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in );
        int n,count =0;
        System.out.println("Enter any number: ");
        n = sc.nextInt();

        for(int i =1 ; i<n ; i++)
        {
             if(n%i==0)
             {
               count= count +i;
             }
        }
        if(count == n)
        {
            System.out.println("Perfect number");
        }
        else
        {
            System.out.println("Not perfect");
        }

    }
}
