package ds;

import java.util.Arrays;

public class Queue {

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

    }

    public boolean empty(){
        if (array == null) return true;
        else return false;
    }

    public int peek(){
        return array[array.length -1];
    }

    public void clear(){

    }

    public void print(){
        System.out.println(Arrays.toString(array));
    }

    public boolean contains(int number){
        return false;
    }

    public int size(){
        return 0;
    }
}
