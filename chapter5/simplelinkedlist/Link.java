package chapter5.simplelinkedlist;

import java.util.Scanner;

public class Link {

    private Container currentAddress;
    private Scanner scan;

    public Link() {

        currentAddress = null;
        scan = new Scanner(System.in);
    }

    public void createLink() {

        while(true){

            System.out.print("Enter Your Data : "); // prompt to get input 

            Container container = new Container(scan.nextInt());
            currentAddress = container.setAddress(currentAddress, container);

            System.out.print("Do You wanna add data ? [1/0] : "); // prompt to get trigger
            if( scan.nextInt() == 0 ) break;
        }
    }

    public void displayLink() {

        Container movedPointer = this.currentAddress; // movedPointer must be container cuz of currentAddress is Container

        while( movedPointer != null ) {

            movedPointer.displayData();
            movedPointer = movedPointer.getLinkAddress();
        }
    }

    public void deleteLink() {

        while(this.currentAddress != null) {

            System.out.print("Deleted : ");
            this.currentAddress.displayData();
            this.currentAddress = this.currentAddress.getLinkAddress();
        }
    }
}