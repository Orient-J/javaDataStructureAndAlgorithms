package stack.delimiter;

public class DelimiterStack {

    private char delimiter[];
    private int size;
    private int current;


    public DelimiterStack(int size) {

        this.size = size;
        this.delimiter = new char[this.size];
        this.current = - 1;

    }

    public void addDelimiter(char delimiter) {

        this.delimiter[++this.current] = delimiter;
    }

    public char showDelimiter() {

        return this.delimiter[this.current];
    }

    public char deleteDelimiter() {

        return this.delimiter[this.current--];
    }

    public boolean isEmpty() {

        return this.current == -1;
    }

    public boolean isFull() {

        return ( this.current == this.size - 1 );
    }
}