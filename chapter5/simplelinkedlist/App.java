package chapter5.simplelinkedlist;

public class App {

    public static void main(String[] args) {

        Link link = new Link();

        link.createLink();

        link.displayLink();

        link.deleteLink();

        link.displayLink(); // check is there data in list;
    }
}