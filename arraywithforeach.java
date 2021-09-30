public class arraywithforeach {
    public static void main(String[] args) {

        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2]= 30;
        arr[4] = 50;

        for( int b : arr)
        {
            System.out.println(b);
        }

    }
}
