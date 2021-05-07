import ds.Queue;

import java.util.Arrays;

public class TestQueue {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.print();
        System.out.println(queue.contains(30));
        System.out.println(queue.size());
        queue.dequeue();
        queue.print();
        System.out.println(queue.contains(30));
        System.out.println(queue.size());
        queue.dequeue();
        queue.print();
        System.out.println(queue.contains(30));
        System.out.println(queue.size());
        queue.dequeue();
        queue.print();
        System.out.println(queue.contains(30));
        System.out.println(queue.size());
        queue.dequeue();
        queue.print();
        System.out.println(queue.size());
        queue.dequeue();
        queue.print();
        System.out.println(queue.size());
        System.out.println(queue.peek());


    }
}
