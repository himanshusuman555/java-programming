// sort()  , equals()  copyof()

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class arrayclassmethod {
    public static void main(String[] args) {

        int a[] = new int[5];
        int a2[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data in array ");
        for(int i = 0 ; i< a.length ; i++)
        {
            a[i]= sc.nextInt();
        }

        System.out.println("Enter data in array 2 ");
        for(int i = 0 ; i< a.length ; i++)
        {
            a2[i]= sc.nextInt();
        }

        Arrays.sort(a);
        for(int i = 0 ; i<a.length ; i++)
        {
            System.out.println(a[i] + " ");
        }

        boolean b =Arrays.equals(a,a2);
        System.out.println(" Is both arrays are equal "+b);

        int a3[] = Arrays.copyOf(a,5);
        System.out.println(" Data in array 3");
        for(int i = 0 ;i <a3.length ; i++)
        {
            System.out.println(a3[i]+ " ");
        }
    }
}
