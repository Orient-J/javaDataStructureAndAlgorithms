package simplesort;

public class BinarySearch {

    private static int start;
    private static int end;
    private static int mid;

    public static void searchByBinary(int arr[], int searchValue) {

        start = 0;
        end = arr.length - 1;
        
        while( start <= end) {

            mid = (int)Math.floor( ( start + end ) / 2 ) ;

            if( arr[mid] == searchValue ) {

                break;
            
            }else if( arr[mid] < searchValue ) {

                start = mid + 1;
            
            }else if( arr[mid] > searchValue ) {

                end = mid - 1;
            }
        }

        System.out.println( ( start > end ) ? searchValue + " is not Found" : arr[mid] + " is found at " + mid );

    }
}