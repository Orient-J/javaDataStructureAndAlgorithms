package chapter5.queuelist;

public class Link {

    private Container first;

    public Link() {

        this.first = null;
    }

    public void createLink(double data) {

        if( first == null ) {

            Container container = new Container(10);

            first = container;
        
        }else{

            Container container = new Container(20);

            first.next = 
        }

    }
}