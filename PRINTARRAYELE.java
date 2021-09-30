// Arrays.tostring()   , Arrays.asList() , Arrays.deeptoString()
import java.util.Arrays;

public class PRINTARRAYELE {
    public static void main(String[] args) {

        String a[] = {"Learn" , "Coding" , "Keypoints" , "Education"};

        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.asList(a));

        int arr[][] = {{10,20} ,{30,40}};
        System.out.println(Arrays.deepToString(arr));
    }
}
