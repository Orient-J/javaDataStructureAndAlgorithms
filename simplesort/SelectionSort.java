package simplesort;

public class SelectionSort extends Sort{

    public static void sortBySelection(int arr[]) {

        int outIdx, inIdx, min;

        for( outIdx = 0; outIdx < arr.length - 1; outIdx++ ) {

            min = outIdx;

            for( inIdx = outIdx + 1; inIdx < arr.length; inIdx++) {

                if(arr[min] > arr[inIdx]) min = inIdx;
            }

            swap(outIdx, min, arr);
        }
    }
}