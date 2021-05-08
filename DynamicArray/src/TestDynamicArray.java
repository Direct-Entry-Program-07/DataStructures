import ds.DynamicArray;

public class TestDynamicArray {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        //dynamicArray.add(0, 100);
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        dynamicArray.add(50);
        dynamicArray.print();
        dynamicArray.add(2,25);
        dynamicArray.print();
        dynamicArray.add(4,35);
        dynamicArray.print();
        dynamicArray.add(60);
        dynamicArray.print();
        dynamicArray.remove(2);
        dynamicArray.print();
        System.out.println(dynamicArray.get(4));
        System.out.println(dynamicArray.contains(30));;
        dynamicArray.clear();
        dynamicArray.print();
        dynamicArray.empty();
    }

}
