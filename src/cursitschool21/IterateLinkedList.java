package cursitschool21;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        System.out.println("Iterating through all elements:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}