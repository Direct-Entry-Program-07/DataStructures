
import java.util.Arrays;


public class Stack {

    int top;
    int array[];

    public Stack() {
        top = 0;
    }

    public void push(int number){
        array[top] = number;
        top ++;
    }

    public void pop(){

        array[top-1] = 0;
        if (top >0){
            top --;
        }else {
            System.out.printf("Stack is empty now");
        }

    }

    public boolean empty(){
        if (array.equals(empty())){
            return true;
        }else {
            return false;
        }
    }

    public int peek(){
        return array[top -1];
    }

    public void clear(){
        for (int i = 0; i < array.length-1; i++) {
            array[i] = 0;
        }
    }

    public void print(){
        System.out.print(Arrays.toString(array));
    }

    public boolean contains(int number){

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == number){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

}

class TestStack {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.print();
    }
}