package simplesort;

public class Sort {

    public static void swap(int num1, int num2, int arr[]) {

        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public static void display(int arr[], boolean index ) {

        if( index ) {

            int idx = 0;

            System.out.println(String.format("%-10s","Index") + "Value");

            while(idx < arr.length) {

                System.out.println(String.format("%-10d",idx) + arr[idx]);

                idx++;
            }
        
        }else{

            for( int val : arr) {

                System.out.print(val + " ");
            }

            System.out.println("");
        }
    }
}