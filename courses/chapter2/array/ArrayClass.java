package courses.chapter2.array;

// import java.util.Scanner;

class ArrayClass{

    private long[] arr = {2, 3, 6, 8, 12, 14, 17, 25, 29, 31, 36, 42, 47, 53, 55, 62};
    // private int numOfElements = 0;
    // private Scanner scan = new Scanner(System.in);

    public ArrayClass(){

        // this.arr[] = ;
        // this.numOfElements = arr.length;
    }

    // insert array method

    /* public void insertArray(){

        int idx = 0;

        while( idx < numOfElements ){

            System.out.print("Insert a value for arr room" + idx + " :: ");
            arr[idx] = scan.nextLong();

            idx++;
        }
    } */

    public void searchElementByLinearSearch(int searchKey){

    }

    public void searchElementByBinarySearch(int searchKey){

        int start = 0;
        int end = arr.length - 1;
        int mid = 0 ;
        
        // System.out.println("Mid = " + mid);

        int loop = 1;

        while( start <= end ){

            mid = (int)Math.floor( (start + end) / 2 );

            // tracing

            System.out.println("number of loop " + loop);

            System.out.println("start = " + start);
            System.out.println("end = " + end);
            System.out.println("mid = " + mid);

            // tracing

            if( arr[mid] == searchKey ) {

                System.out.println("Since A["+mid+"] => " + arr[mid] + " is equal " + searchKey);

                System.out.println(searchKey + " is found at " + mid);
                break;
            
            }else if( arr[mid] < searchKey ){

                start = mid + 1;

                System.out.println("Since A["+mid+"] => " + arr[mid] + " < " + searchKey + ", start = mid + 1 = " + start );
                

            }else if( arr[mid] > searchKey ){

                end = mid - 1;

                System.out.println("Since A["+mid+"] => " + arr[mid] + " > " + searchKey + ", end = mid - 1 = " + end );

            }

            System.out.println("////////////////////////////////////////////////////");
        
            loop++;
        }

        if( arr[mid] != searchKey){

            System.out.println("==================================================");

            System.out.println("Since start = " + start + " > end = " + end + ". And Loop is end");

            System.out.println(searchKey + " is not found!!!");
        }
    }   
}