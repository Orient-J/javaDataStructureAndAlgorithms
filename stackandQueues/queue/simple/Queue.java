package queue.simple;

public class Queue {

    private long arr[];
    private int front;
    private int rear;
    private int size;
    private int count;

    public Queue(int size) {

        this.size = size;
        this.arr = new long[this.size]; 
        this.rear = -1; // to insert 
        this.front = 0; // first out 
        this.count = 0; // to count the number of element according to the operations 

    }

    public void push(long datum) {

        if( !isFull() ) {

            if( this.rear == this.size - 1 ) this.rear = -1; // when arr is full, rear to starting point

            this.arr[++rear] = datum; // adding new datum 

            this.count++; // increase the number of arrary and checking 
        
        }else{

            System.out.println("Your Queue is Full");
        }
    
    }

    public long peek() {

        return this.arr[this.front]; // first out 
    }

    public long pop() {

        long datum = 0;

        if( !isEmpty() ) {


            datum = this.arr[this.front++]; // get pop datum 

            if( this.front == this.size ) this.front = 0; // when arr is empty, front to start point 

            this.count--; // check the number of array 

        }else{

            System.out.println("There is nothing left to be pop");
        }

        return datum; // return pop datum 
    }

    public boolean isEmpty() {

        return (this.count == 0);
    }

    public boolean isFull() {

        return (this.count == this.size);
    }
}