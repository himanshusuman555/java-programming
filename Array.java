import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int a[] = {10,20,30,40,50};
        System.out.println(a[3]);

        int b[] = new int[5];
        a[0] = 10;
        a[1] = 100;
        a[2] = 1000;
        a[3] = 10000;
        a[4] = 100000;

        for(int i=0 ; i<5 ;i++)
        {
            System.out.println(a[i]);
        }

        int size, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        int arr[] = new int[size];
        for(j=0 ; j<size ; j++)
        {
           a[j] = sc.nextInt();
        }
        System.out.println("printed array elements");
        {
            for(j=0 ; j<size ; j++)
            {
                System.out.print(a[j]+ " ");
            }
        }
    }

}
