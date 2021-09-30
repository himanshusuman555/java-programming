import java.util.Arrays;
import java.util.Optional;

public class arraycompare {
    public static void main(String[] args) {

        int a[] = {10,20,30,40,50};
        int b[] = {10,20,30,40,50};

        if(Arrays.equals(a,b))
        {
            System.out.println("Both are equals");
        }
        else
        {
            System.out.println("Not equal");
        }

    }
}
