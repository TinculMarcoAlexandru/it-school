package cursitschool21;

import java.util.LinkedList;

public class AppendToLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.addLast("Date");
        System.out.println("Linked list after appending: " + list);
    }
}