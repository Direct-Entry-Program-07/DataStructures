import ds.Queue;

import java.util.Arrays;

public class TestQueue {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.print();
        System.out.println(queue.contains(30));
        System.out.println(queue.size());
        queue.deQueue();
        queue.print();
        System.out.println(queue.contains(30));
        System.out.println(queue.size());
        queue.deQueue();
        queue.print();
        System.out.println(queue.contains(30));
        System.out.println(queue.size());
        queue.deQueue();
        queue.print();
        System.out.println(queue.contains(30));
        System.out.println(queue.size());
        queue.deQueue();
        queue.print();
        System.out.println(queue.size());
        queue.deQueue();
        queue.print();
        System.out.println(queue.size());
        System.out.println(queue.peek());


    }
}
