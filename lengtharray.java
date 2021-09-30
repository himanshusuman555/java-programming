import java.util.Scanner;
public class lengtharray {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in Array");
        for(int i = 0 ; i< a.length ; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0 ; i< a.length ; i++)
        {
            System.out.println(a[i]+ " ");
        }
        System.out.println(a.length);
    }
}

