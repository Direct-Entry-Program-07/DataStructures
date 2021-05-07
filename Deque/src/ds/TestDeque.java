package ds;

public class TestDeque {

    public static void main(String[] args) {
        DeQue deQue = new DeQue();
        deQue.enQueue(10, deQue.size());
        deQue.enQueue(20);
        deQue.enQueue(30);
        deQue.print();
        deQue.size();
        System.out.println(deQue.size());
        deQue.enqueueRear(20);
        deQue.enqueueRear(10);
        deQue.print();
    }
}
