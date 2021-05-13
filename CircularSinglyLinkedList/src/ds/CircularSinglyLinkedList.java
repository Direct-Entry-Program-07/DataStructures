package ds;

public class CircularSinglyLinkedList {

    Node first;
    Node last;
    int listSize = 0;
    Node head = first;

    public void add(int number){

        Node node = new Node(number);

        if (empty()){
            first = node;
            last = first;
            head = first;
        }else {
            head.setNext(node);
            head = head.getNext();
        }
        last = head;
        last.setNext(first);
        listSize++;
    }

    public void add(int index, int number){

        Node node = new Node(number);
        int counter;

        if (index < 0){
            throw new RuntimeException("Invalid Index");
        }
        if (empty()){
            first = node;
            last = first;
            head = first;

        }else if (index == 0){
            head = first;
            first = node;
            node.setNext(head);
            last.setNext(first);
        }else {
            head = first;
            counter = 1;
            System.out.println();
            while (head != last){
                if (counter == index){
                   Node temp = head.getNext();
                   head.setNext(node);
                   node.setNext(temp);
                }
                head = head.getNext();
                counter++;
            }

        }

        listSize++;
    }

    public void remove(int index){
        Node temp;
        head = first;

        if (index < 0 || index > size() - 1){
            throw new RuntimeException("Invalid Index");
        }
        if (empty()){
            throw new RuntimeException("List is Empty");
        }
        if (index == 0){
            first = first.getNext();
        }else {
            int counter = 1;
            temp = first;
            while (counter>0){
                if(counter == index){
                    temp = head.getNext();
                    head.setNext(temp.getNext());
                }
                counter++;
            }
        }

    }

    public int get(int index){
        Node getHead;
        int count = 0;

       if (index > size()-1 || index <0){
           throw new RuntimeException("Invalid Index");
       }
       if (empty()){
           throw new RuntimeException("List is Empty");
       }

       if (index == 0){
           return first.getValue();
       }else {
           getHead = first;
           count++;
           while (count < index+1){
               getHead = getHead.getNext();
               count++;
           }
           return getHead.getValue();
       }
    }

    public void print(){
        Node printHead;
        int count;

        if (empty()){
            System.out.println("[]");
            return;
        }else {
            System.out.print("[");
            printHead = first;

            while (printHead != null ){

                System.out.print(printHead.getValue());
                if (printHead != last){
                    System.out.print(",");
                }
                if (printHead == last){
                    break;
                }else {
                    printHead = printHead.getNext();
                }

            }
            System.out.println("]");
        }
    }

    public int size(){
        return listSize;
    }

    public boolean contains(int number){
        int counter = size();
       while (counter>0){
           head = head.getNext();
           if (head.getValue() == number){
               return true;
           }
           counter--;
       }
       return false;
    }

    public boolean empty(){
        if (first == null){
            return  true;
        }else {
            return false;
        }

    }

    public void clear(){
        first = null;
    }

}
