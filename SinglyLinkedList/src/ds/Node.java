package ds;

public class Node {

    private int data;
    private String next;
    private int index;

    public Node(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getData(int index) {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
}
