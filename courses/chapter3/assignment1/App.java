package courses.chapter3.assignment1;

import javax.naming.directory.InitialDirContext;

public class App{

    public static void main(String[] args){

        int[] arr = {77,99,44,55,22,88,11,0,66,33};

        int outIdx , inIdx , minIdx;

        for( outIdx = 0; outIdx < arr.length - 1; outIdx++ ) {

            minIdx = outIdx;

            System.out.println("=> This is " + ( outIdx + 1 ) + " time");

            for( inIdx = outIdx + 1; inIdx < arr.length; inIdx++  ) {

                System.out.print("When outIndx = " + outIdx + ", ");
                System.out.println("inIndx = " + inIdx);

                if( arr[inIdx] < arr[minIdx] ) {

                    System.out.print("Since arr[inIndx] = " + arr[inIdx] + " < " + " arr[minIndx] = " + arr[minIdx] + " ,");

                    minIdx = inIdx;

                    System.out.println("minIdx = inIdx = " + minIdx );

                }else{

                    System.out.print("Since arr[inIndx] = " + arr[inIdx] + " > " + " arr[minIndx] = " + arr[minIdx] + " ,");
                    System.out.println("minIdx = " + minIdx );

                }   

                System.out.println("_______________________________________________");
            }

            System.out.println("Before Swaping arr[outIdx] and arr[minIdx]...");
            System.out.println("arr[outIndx] = " + arr[outIdx]);
            System.out.println("arr[minIndx] = " + arr[minIdx]);

            int temp = arr[outIdx] ;

            arr[outIdx] = arr[minIdx];

            arr[minIdx] = temp;

            System.out.println("After Swaping arr[outIdx] and arr[minIdx]...");
            System.out.println("arr[outIndx] = " + arr[outIdx]);
            System.out.println("arr[minIndx] = " + arr[minIdx]);

            for( int ele : arr ){

                System.out.print(ele + " ");
            }

            System.out.println("\n ////////////////////////////////////////");
        }
    }

}