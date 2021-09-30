public class characterpattern {
    public static void main(String[] args) {

        char i,j;
        for(i='A' ; i<='E' ; i++ )    //raws
        {
            for(j='A' ; j<= i ; j++)    //column
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }

        System.out.println();

        for(i=65 ; i<=69 ; i++ )    //raws
        {
            for(j=65 ; j<= i ; j++)    //column
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
        char count=65;
        for(i=65 ; i<=69 ; i++ )    //raws
        {
            for(j=65 ; j<= i ; j++)    //column
            {
                System.out.print(count);
                count++;
            }
            System.out.print("\n");
        }

    }
}
