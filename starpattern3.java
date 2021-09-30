public class starpattern3 {
    public static void main(String[] args) {

        int i,j,k;
        for(i=1 ;i <=5 ;i++) // raws
        {
            for(j=i ; j<5 ; j++) //space
            {
                System.out.print(" ");
            }
            for(k=1 ; k<=i ;k++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println();

        for(i=1 ;i <=5 ;i++) // raws
        {
            for(j=1 ; j<i ; j++) //space
            {
                System.out.print(" ");
            }
            for(k=5 ; k>=i ;k--)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
