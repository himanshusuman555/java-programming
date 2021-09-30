import java.util.Scanner;
public class Reverseno {
    public static void main(String[] args) {

        int number , number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numer to reverse :");
        int n = sc.nextInt();  //123


        while (n>0) {
            number = n % 10;   //3
            System.out.print(number);
            n = n / 10;
        }



    }
}
