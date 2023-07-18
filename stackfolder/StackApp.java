public class StackApp {

    private long[] stackArr;
    private int size;
    private int current;

    public StackApp(int length) {

        this.size = length;
        this.stackArr = new long[this.size];
        this.current = -1;
    }

    public void push(long element) {

        stackArr[++this.current] = element;
    }

    public long peek() {

        return stackArr[this.current];
    }

    public long pop() {

        return stackArr[this.current--];
    }

    public boolean isEmpty() {

        return (this.current == -1);
    }

    public boolean isFull() {

        return ( this.current == this.size - 1);
    }

    public int getStackLength() {

        return this.size;
    }
}