package stack.reversestack;
public class CharStack {

    // data

    private char arr[];
    private int size;
    private int current;

    // constructor 

    public CharStack(int size) {

        this.size = size;
        this.arr = new char[this.size];
        this.current = -1;
    }

    // methods 

    // methods for adding character to the stack 

    public void pushChar(char character) {

        this.arr[++this.current] = character;
    }

    // methods for display character from stack 

    public char peekChar() {

        return this.arr[this.current];
    }

    // methods for deleting character from stack 

    public char popChar() {

        return this.arr[this.current--];
    }

    // methods for checking whether there are character or not

    public boolean isEmpty() {

        return ( this.current == -1 );
    }

    // methods for checking whether stack is full of character or not 

    public boolean isFull() {

        return ( this.current == this.size - 1) ;
    }

    // methods for deleting all data from stack 

    public void popAll() {

        while( !isEmpty() ) {

            System.out.print( popChar() );
        }
    }
}