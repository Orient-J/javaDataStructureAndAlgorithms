package stack.reversestack;
public class Reverser {

    public void doReverse(String str) {

        CharStack charStack = new CharStack(str.length());

        for( int idx=0; idx<str.length(); idx++) {

            charStack.pushChar( str.charAt(idx) );
        }

        charStack.popAll();
    }

}