// import java.util.Scanner;

// import stack.delimiter.CheckDelimiter;
// import stack.delimiter.DelimiterStack;

// import queue.simple.*;
import queue.priority.PriorityQueue;


public class App {

    public static void main(String[] args) {

        // Stack stack = new Stack(5);

        // stack.push(10);
        // stack.push(20);
        // stack.push(30);

        // System.out.println(stack.peek());

        // stack.pop();

        // System.out.println(stack.peek());

        // stack.push(20);
        // stack.push(40);
        // stack.push(50);

        // while( !stack.isEmpty() ) {

        //     System.out.print("Deleted : ");
        //     System.out.println( stack.pop() );

        // }

        // stack.push(10);
        // stack.push(20);
        // stack.push(40);
        // stack.push(50);
        // stack.push(55);

        // stack.peekAll();

        // stack.popAll();

        // stack.peekAll();


        // Scanner scan = new Scanner(System.in);

        // System.out.print("Enter Your String :: ");
        // String str = scan.nextLine();

        // Reverser reverse = new Reverser();

        // reverse.doReverse(str);

        // scan.close();

        // String str = "a{b(c]d}e";

        // CheckDelimiter delimiter = new CheckDelimiter();

        // delimiter.check(str);

    //     Queue queue = new Queue(5);

    //     queue.push(30);
    //     queue.push(60);
    //     queue.push(50);
    //     queue.push(50);
    //     queue.push(50);
    //     queue.push(50);


    //     display(queue.peek());

    //     display(queue.pop());
    //     display(queue.pop());
    //     display(queue.pop());
    //     display(queue.pop()); // there is no data to return
    //     display(queue.pop()); // there is no data to return
        
        
    //     // auto checking and insert

    //     while( !queue.isFull() ) {

    //         queue.push( addData() );
    //     }

    //     while( !queue.isEmpty() ) {

    //         System.out.println("Deleted :: " + queue.pop() );
    //     }

        PriorityQueue priorityQueue = new PriorityQueue(5);

        priorityQueue.push(20);
        priorityQueue.push(50);
        priorityQueue.push(10);
        priorityQueue.push(5);
        

        while( !priorityQueue.isEmpty() ) {

            display("Deleted : " + priorityQueue.pop());
        }
    }

    public static void display(int datum) {

        System.out.println(datum);
    }

    public static void display(long datum) {

        System.out.println(datum);
    }

    public static void display(String info) {

        System.out.println(info);
    }

    // public static long addData() {

    //     Scanner scan = new Scanner(System.in);

    //     System.out.print("Insert Your Data :: ");

    //     return scan.nextLong();

    // }

}