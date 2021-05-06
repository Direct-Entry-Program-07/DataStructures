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

        array[top] = 0;
        if (top >0){
            top --;
        }else {
            System.out.printf("Stack Overflow");
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
        return top;
    }

    public void clear(){
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public void print(){
        System.out.printf(Arrays.toString(array));
    }

    public boolean contains(int number){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

}
