package ds;

public class SinglyLinkedList {

    int index= 0;
    Node node = new Node(index);

    public void add(int number){
        if (index == 0){
            node.setData(number);
            System.out.println("Index: "+index+" Value "+ node.getData(index));

        }else {
            Node node = new Node(index);
            node.setData(number);
            System.out.println("Index: "+index+" Value "+ node.getData(index));

        }
        index++;
    }

    public void add(int index,int number){

    }

    public void remove(int index){

    }

    public int get(int index){
        return -1;
    }

    public void print(){

        System.out.println(node.getData(1));

        /*System.out.print("[");
        for (int i = 0; i <= index; i++) {
           int temp =node.getData(i);
            System.out.print(temp+" ,");
        }
        System.out.println("]");*/

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
