import java.util.Scanner;

public class decendingsortarray {
    public static void main(String[] args) {


        int a[] = new int[5];
        int i , j ,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in array");
        for(i=0;i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }

        System.out.println("Array elements");

        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        for (i = 0; i < a.length; i++) {
            for (j = i+1; j < a.length; j++) {
                if(a[i] < a[j]) {
                    temp  = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("After sorting array elements in ascending");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]+ " ");
        }

    }
}


