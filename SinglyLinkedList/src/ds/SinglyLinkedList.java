package ds;

public class SinglyLinkedList {

    int nodeCount = 0;
    int index = 0;
    Node firstNode = new Node();
    Node nextNode = new Node();

    public static void initialize(){

    }

    public void add(int number){

        if (index == 0)
        {
            firstNode.setIndex(index);
            firstNode.setData(number);
            firstNode.setNext(nextNode.toString());
            index++;
        }else {

            nextNode.setIndex(index);
            nextNode.setData(number);
            nextNode.setNext(nextNode.toString());
            index++;

        }


       // System.out.println(node.getNext());
    }

    public void add(int index,int number){

    }

    public void remove(int index){

    }

    public int get(int index){
        return -1;
    }

    public void print(){
        if (empty()){
            System.out.println("[]");
        }else {


                System.out.print(firstNode.getData());
                System.out.print(", ");
                System.out.print(nextNode.getData());


        }
       // System.out.println(empty() ? "[]" : node.getData());
    }

    public void clear(){

    }

    public int size(){
        return index;
    }

    public boolean contains(int number){
        return false;
    }

    public boolean empty(){
        if (index == 0){
            return true;
        }else {
            return false;
        }

    }
}
