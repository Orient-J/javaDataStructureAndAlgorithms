package simplesort;

public class BubbleSort extends Sort{

    public static void sortByBubbleSort(int arr[]) {

        int outIdx, inIdx;
        
        for( outIdx = arr.length-1 ; outIdx >= 1 ; outIdx-- ) {

            for( inIdx = 0 ; inIdx < outIdx ; inIdx++ ) {


                if( arr[inIdx] > arr[inIdx + 1]) swap(inIdx, inIdx + 1, arr); 
            }

        }
    }
}