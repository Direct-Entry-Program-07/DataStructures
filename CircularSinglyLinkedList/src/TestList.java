import ds.CircularSinglyLinkedList;

public class TestList {
    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        list.add(12);
        list.add(99);
        list.add(37);
        list.add(32);
        list.add(45);
        list.print();
        list.remove(2);
        list.print();
    }


}
