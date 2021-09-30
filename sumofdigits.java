import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , reverse , sum= 0;
        System.out.println("Enter a number to sum its all digits");
        n = sc.nextInt();  //123

        while(n>0)
        {
            reverse = n % 10; // 3
            sum = sum + reverse;
            n = n/10; //12
        }
        System.out.println(sum);

    }
}
