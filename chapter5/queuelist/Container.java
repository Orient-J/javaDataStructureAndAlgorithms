package chapter5.queuelist;

public class Container {

    private double data;
    private Container linkedAddress;

    public Container(double data) {

        this.data = data;
    }

    public String getData() {

        return "{ " + this.data + " }";
    }

    public void setLinkedAddress(Container address) {

        this.linkedAddress = address;
    }

    public Container getLinkedAddress() {

        return this.linkedAddress;
    }
}