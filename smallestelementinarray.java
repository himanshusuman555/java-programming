import java.util.Scanner;

public class smallestelementinarray {
    public static void main(String[] args) {

        int min;
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements ");
        for(int i=0 ; i<a.length ; i++)
        {
            a[i] = sc.nextInt();
        }

        min = a[0];
        for(int i=1 ; i<5 ; i++)
        {
            if (a[i] < min)
            {
                min = a[i];
            }
        }
        System.out.println("Minimum value  ="+min);

    }
}

