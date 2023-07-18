package stack.simple;

public class Stack {

    // data 

    private long arr[];
    private int size;
    private int current;

    // initializing automatically in constructor;

    public Stack(int size) {

        this.arr = new long[size];
        this.size = size;
        this.current = -1;
    }

    // methods 

    // method for adding data to stack;

    public void push(long datum) {

        this.arr[++this.current] = datum; 
    }

    // method for deleting data from stack;

    public long pop() {

        return this.arr[this.current--];
    }

    // method for displaying last datum from stack;

    public long peek() {

        return this.arr[this.current];
    }

    // method for checking whether stack is empty or not 

    public boolean isEmpty() {

        return ( this.current == -1 );
    }

    // method for checking whether stack is full or not 

    public boolean isFull() {

        return ( this.current == this.size - 1 );
    }

    // methods for deleting all data

    public void popAll() {

        while( !isEmpty() ) {

            System.out.print("Deleted : ");
            System.out.println( pop() );
        }
    }

    // methods for displaying all data

    public void peekAll() {

        int pointer = this.current;

        while( !( pointer == -1 ) ) {

            System.out.println( this.arr[pointer--] );
        
        }

        pointer = this.current;
    }
}