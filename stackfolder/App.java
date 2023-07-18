import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static Scanner scan = new Scanner(System.in);

    private static StackApp stack = new StackApp(getSizeStack());

    private static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {

        do{
            System.out.print("Enter Command For Stack Operation :: ");
            doStackOperation(buffer.readLine());

        }while(true);

    }   

    private static int getSizeStack() {

        System.out.print("Enter Number of Elements you want to add :: ");

        return scan.nextInt();
    }

    private static void setStackElements(int length) {

        System.out.println("in setting stack");

        char trigger = 'y';

        do{

            System.out.println("The number of elements can be added = " + --length + " left" );

            try{
                System.out.print("Enter Number to be added to stack :: ");
                stack.push(scan.nextLong());

                if( length > 0 ) {

                    System.out.println("Do You want add another one [y/n]:: ");
                    trigger = buffer.readLine().charAt(0);
                
                }else{

                    System.out.println("Your Stack is Full.");
                    break;
                }
            
            }catch(IOException exception) {

                exception.setStackTrace(null);
            
            }catch(InputMismatchException exception) {

                System.out.println("You Input is missed the type of input needed...");
            }


        }while(trigger == 'y') ;
    } 

    private static void doStackOperation(String command) {

        if( 
            
            command == "push"
            
            
            ) {

            switch(command.toLowerCase()) {

                case "pop" :
                    stack.pop();
                break ;
                
                case "peek" : 
                    stack.peek();
                break ;
    
                case "push":
                    setStackElements(stack.getStackLength());
                break ;
            }
        }else {

            System.out.println("Wrong Command");
        }
    }

}