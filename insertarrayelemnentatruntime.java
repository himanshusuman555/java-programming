// a[3] = 34 67 27
// loc =1   item =100
// a[3+1] = 34 100 67 23
import java.util.Scanner;
public class insertarrayelemnentatruntime {
    public static void main(String[] args) {

        int size ,item , loc , i ;
        System.out.println("Enter the array size");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        int a[] = new int[size+1];
        System.out.println("Enter array elements");
        for(i=0 ; i<size ; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter New Item ");
        item = sc.nextInt();

        System.out.println("Enter the location");
        loc = sc.nextInt();

        for(i= size ; i>loc ;i--)
        {
            a[i]=a[i-1];
        }
        a[loc] = item;
        size++;

        System.out.println("New list display");
        for(i=0 ; i<size ;i++)
        {
            System.out.println(a[i]+ " ");
        }

    }
}
