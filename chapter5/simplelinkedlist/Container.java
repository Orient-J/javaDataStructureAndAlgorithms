package chapter5.simplelinkedlist;

public class Container {

    private double data;
    private Container linkedAddress;

    public Container(double data) {

        this.data = data;
    }

    public void displayData() {

        System.out.println("{" + data +"}");
    }

    public Container setAddress(Container address, Container container) {

        this.linkedAddress = address;
        
        return container;
    }

    public Container getLinkAddress() {

        return this.linkedAddress;
    }
}