
import ds2.Deque;

public class TestDeque {

    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.enqueue(10);
        deque.enqueue(20);
        deque.enqueue(30);
        deque.print();
        deque.enqueueRear(5);
        deque.enqueueRear(2);
        deque.print();
        deque.dequeueFront();
        deque.dequeueFront();
        deque.print();
    }
}