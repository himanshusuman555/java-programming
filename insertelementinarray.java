import java.util.Scanner;
public class insertelementinarray {
    public static void main(String[] args) {

        int size,loc,item,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        size = sc.nextInt();

        int a[] = new int[size+1];

        System.out.println("Enter array elements");
        for(i = 0 ; i< size ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter array location");
        loc = sc.nextInt();
        System.out.println("Enter new item");
        item = sc.nextInt();

        for(i =size ; i >loc ;i--)
        {
            a[i] = a[i-1];
        }
        a[loc]=item;
        size++;
        for(i=0 ; i<a.length ; i++)
        {
            System.out.println(a[i]);
        }


    }
}
