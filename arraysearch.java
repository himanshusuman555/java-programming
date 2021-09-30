import java.util.Scanner;
// a[] = {10,20,30,40,50}
// search item 70   ---> item not found
public class arraysearch {
    public static void main(String[] args) {

        int a[] = {10,20,30,40,50};
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which element to search");
        int n =sc.nextInt();

        for(int i =0 ; i<a.length ; i++)
        {
            if (a[i] == n)
            {
                count++;
                System.out.println("The element found at index position :" + i + "at postion " + (i + 1));
            }
        }
        if(count==0)
        {
            System.out.println("Element not found");
        }
    }
}
