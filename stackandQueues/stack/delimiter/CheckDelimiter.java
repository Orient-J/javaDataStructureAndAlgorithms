package stack.delimiter;

public class CheckDelimiter {

    public void check(String str) {

        DelimiterStack delimiter = new DelimiterStack(str.length());

        for( int idx = 0 ; idx < str.length() ; idx++ ) {

            switch( str.charAt(idx) ) {

                case '(' : 
                case '{' :
                case '[' :
                    delimiter.addDelimiter(str.charAt(idx));
                break;

                case ')':
                case '}':
                case ']':

                    char closing = str.charAt(idx);

                    if( !delimiter.isEmpty() ) {

                        char opening = delimiter.deleteDelimiter();

                        if( 

                        opening != '(' && closing == ')' ||
                        opening != '{' && closing == '}' ||
                        opening != '[' && closing == ']' 
                    
                        ) {

                            System.out.println("Not Found " + closing + " at " + idx );
                        
                        }  
                    
                    }else {

                        System.out.println("There is no opening");
                    } 
                break;

                default : 
                break;
            }
        }

        if( !delimiter.isEmpty()) {

            System.out.println("There is no matching opening and closing.");
        }
    }
}