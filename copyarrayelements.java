// first a[] = {10,20,30}   -----> b[] ={ 10,20,30}
import java.util.Scanner;
public class copyarrayelements {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values into first array");

        for(i=0 ; i<a.length ; i++)
        {
            a[i]= sc.nextInt();
        }

        System.out.println("First array elemenets are:");
        for(i=0 ; i<a.length ; i++)
        {
            System.out.println(a[i]+ " ");
        }

        System.out.println("Second array elements = ");
        for(i =0 ; i<a.length ; i++)
        {
            b[i] = a[i];
            System.out.println(b[i]+ " ");
        }

    }
}
