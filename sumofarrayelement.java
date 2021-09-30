import java.util.Scanner;

// sum of array element
public class sumofarrayelement {
    public static void main(String[] args) {
        int a[]= new int[5];
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values into array");
        for (int i = 0 ;i<a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Sum of array elements");
        for (int i = 0 ;i<a.length ; i++)
        {
            sum = sum +a[i];
        }
        System.out.println(sum+ " ");
    }
}
