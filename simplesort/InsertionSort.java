package simplesort;

public class InsertionSort extends Sort {

    public static void sortByInsertion(int arr[]) {

        int outIdx, inIdx, temp;

        for( outIdx = 1; outIdx < arr.length; outIdx++) {

            temp = arr[outIdx];

            for( inIdx = outIdx; inIdx > 0 && arr[inIdx - 1] >= temp; inIdx-- ) {

                arr[inIdx] = arr[inIdx - 1];
            }

            arr[inIdx] = temp;
        }
    }
}