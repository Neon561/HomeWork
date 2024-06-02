public class Main {

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("d");
        list.add("c");
        list.add("b");
        list.add("a");
        
        MyArrayList.sort(list);


        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("d");
        myLinkedList.add("c");
        myLinkedList.add("b");
        myLinkedList.add("a");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("_____________________");
        MyLinkedList.bubbleSort(myLinkedList);
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }
    }

}
