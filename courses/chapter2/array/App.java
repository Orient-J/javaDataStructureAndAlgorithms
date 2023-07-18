package courses.chapter2.array;

import java.util.Scanner;

public class App{

    public static void main(String[] args){

        ArrayClass arr1 = new ArrayClass();

        // arr1.insertArray();

        // arr1.searchElementByBinarySearch(29); // test

        // arr1.searchElementByBinarySearch(42);

        // arr1.searchElementByBinarySearch(8);

        // arr1.searchElementByBinarySearch(17);

        // arr1.searchElementByBinarySearch(36);

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter Search Key :: ");
            int searchKey = scan.nextInt();

            arr1.searchElementByBinarySearch(searchKey);
        }
    }
} 
