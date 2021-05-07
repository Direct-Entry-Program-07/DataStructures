package ds;


import java.util.Arrays;

class Queue {

    private int array[];

    public void enQueue(int number){
        if(array == null){
            array = new int[1];
            array[0] = number;
        }else {
            int[] temp = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            temp[temp.length - 1] = number;
            array = temp;
        }
    }

    public void deQueue(){
        if(array == null){
            System.out.println("Queue is empty");
            return;
        }else if (array.length == 1){
            array = null;
            return;
        }
        int temp[] = new int[array.length -1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = array[i+1];
        }
        array = temp;
    }

    public boolean empty(){
        if (array == null) return true;
        else return false;
    }

    public int peek(){
        if (array == null){
            return 0;
        }
        return array[array.length -1];
    }

    public void clear(){
        array = null;
    }

    public void print(){
        if (array == null){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(Arrays.toString(array));
    }

    public boolean contains(int number){
        if (array.length == 0){
            System.out.println("Queue is empty");
            return false;
        }else{
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number){
                    return true;
                }
            }
            return false;
        }
    }

    public int size(){
        return empty() ? 0 : array.length;
    }
}


public class DeQue extends Queue{
    int length;

    DeQue(){
        Queue queue = new Queue();
        length = queue.size();
        System.out.println(length);
    }

    public void enqueueRear(int number){
        int[] temp = new int[deq]

    }

    public void dequeueFront(){

    }

}
