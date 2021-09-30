import java.util.Scanner;
public class monthanddays {
    public static void main(String[] args) {

        int n;
        System.out.println("Enter month number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        switch(n)
        {
            case 1: System.out.println(" jan 31"); break;
            case 2: System.out.println(" feb 28"); break;
            case 3: System.out.println(" mar 31"); break;
            case 4: System.out.println(" apr 30"); break;
            case 5: System.out.println(" may 31"); break;
            case 6: System.out.println(" june 30"); break;
            case 7: System.out.println(" july 31"); break;
            case 8: System.out.println(" AUg 31"); break;
            case 9: System.out.println(" Sep 30"); break;
            case 10: System.out.println(" Oct 31"); break;
            case 11: System.out.println(" nov 30"); break;
            case 12: System.out.println(" Dec 31"); break;
            default: System.out.println("Invalid choice");

        }

    }
}
