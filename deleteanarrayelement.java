import java.util.Scanner;
public class deleteanarrayelement {
    public static void main(String[] args) {

        int size,loc,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter elements in array");
        for(i=0 ; i<size;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the location to delete the array element");
        loc = sc.nextInt();


        for(i=loc ;i<size-1;i++)
        {
            a[i]=a[i+1];
        }
        size--;


        for(i=0 ; i< size ; i++)
        {
            System.out.println(a[i]+ " ");
        }



    }
}
