package ds;

public class TestDeque {

    public static void main(String[] args) {
        DeQue deQue = new DeQue();
        deQue.enQueue(10);
        deQue.enQueue(20);
        deQue.enQueue(30);
        deQue.print();
        deQue.enqueueRear(20);
        deQue.enqueueRear(10);
        deQue.print();
    }
}
