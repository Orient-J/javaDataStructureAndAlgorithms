package queue.priority;

public class PriorityQueue {

    private int[] arr;
    private int size;
    private int count;

    public PriorityQueue(int size) {

        this.size = size;
        this.arr = new int[this.size];
        this.count = 0;
    }

    public boolean isEmpty() {

        return ( this.count == 0 ) ;
    }

    public boolean isFull() {

        return ( this.count == this.size ) ;
    }

    public void push(int datum) {

        if( isEmpty() ) {

            this.arr[this.count++] = datum;
        
        }else{

            int idx = this.count;

            while( idx >= 0 ) {

                if( datum < this.arr[idx] ) {

                        break;
                }else{


                    this.arr[idx + 1] = this.arr[idx];
                }

                idx--;
            }

            this.arr[idx+1] = datum;

            this.count++;
        }
    }

    public int peek() {

        return this.arr[this.count - 1];
    }

    public int pop() {

        return this.arr[--this.count];
    }
}

