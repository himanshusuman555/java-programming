import java.util.Scanner;

public class avgofarrayelement {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int sum=0;
        Scanner sc = new Scanner(System.in);

        for(int i =0 ; i<a.length ; i++)
        {
            sum =sum+a[i];
        }
        int average = sum/a.length;
        System.out.println("Average = "+average);
    }
}
