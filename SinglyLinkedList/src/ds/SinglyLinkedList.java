package ds;

public class SinglyLinkedList {

    private Node first = null;
    private Node last = null;
    int count;


    public void add(int number){

        Node node = new Node(number);

        if (first == null){
            first = node;
            last = node;
            count++;

        }else {
            last.setNext(node);
            last = node;
            count++;
        }

    }

    public void add(int index,int number){

    }

    public void remove(int index){

    }

    public int get(int index){
        return -1;
    }

    public void print(){

        Node temp = first;

        for (int i = 0; i < count; i++) {
            if(temp != null){
                System.out.println(temp.getValue());
                temp = temp.getNext();
            }
        }

    }

    public void clear(){

    }

    public int size(){
        return -1;
    }

    public boolean contains(int number){
        return false;
    }

    public boolean empty(){
        return false;

    }
}
