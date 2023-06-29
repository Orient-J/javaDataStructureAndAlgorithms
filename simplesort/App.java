package simplesort;

public class App extends Sort{

    public static void main(String[] args) {

        int arr[] = {99, 88, 55, 77, 44, 22, 11};

        BubbleSort.sortByBubbleSort(arr);

        // SelectionSort.sortBySelection(arr);

        // InsertionSort.sortByInsertion(arr);

        display(arr, false);

        BinarySearch.searchByBinary(arr, 1100);
    }
}