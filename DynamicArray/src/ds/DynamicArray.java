package ds;

import java.util.Arrays;

public class DynamicArray {

    protected int[] numbers;

    public void add(int number){

        if (this.empty()){
            this.numbers = new int[1];
            this.numbers[0] = number;
        }else{
            int[] temp = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                temp[i] = numbers[i];
            }
            temp[temp.length - 1]= number;
            numbers = temp;
        }
    }

    public void add(int index, int number){
        if (this.empty()){
            System.out.println("Array is Empty..");
        }else{
            int[] temp = new int[numbers.length + 1];

            for (int i = 0; i < index; i++) {
                temp[i] = numbers[i];

            }

            temp[index]= number;

            for (int j = index+1; j < numbers.length+1; j++) {
                temp[j] = numbers[j-1];
            }
            numbers = temp;
        }
    }

    public void remove(int index){
        if (this.empty()){
            System.out.println("Array is Empty..");
        }else{
            int[] temp = new int[numbers.length - 1];

            for (int i = 0; i < index; i++) {
                temp[i] = numbers[i];

            }

            for (int j = index+1; j < numbers.length+1; j++) {
                temp[j] = numbers[j-1];
            }
            numbers = temp;
            System.out.println();
        }

    }

    public int get(int index){
        return numbers[index];
    }

    public void print() {
        System.out.println(Arrays.toString(numbers));
    }

    public void clear(){

    }

    public int size(){
        return empty()? 0: numbers.length;
    }

    public boolean contains(int number){
        if (empty()){
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number){
                return true;
            }
        }
        return false;
    }

    public boolean empty(){
        return this.numbers == null;
    }

}
