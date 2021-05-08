package ds;

public class SinglyLinkedList {

    int nodeCount = 0;

    Node node = new Node(); //create the current node
    Node nextNode = new Node(); //create the next node which pointed by the current node

    public void add(int number){

        nodeCount++;
        node.setData(number);
        node.setNext(nextNode.toString());

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
            if (size())
            System.out.print("["+node.getData()+"]");
        }
       // System.out.println(empty() ? "[]" : node.getData());
    }

    public void clear(){

    }

    public int size(){
        return nodeCount;
    }

    public boolean contains(int number){
        return false;
    }

    public boolean empty(){
        if (nodeCount == 0){
            return true;
        }else {
            return false;
        }

    }
}
