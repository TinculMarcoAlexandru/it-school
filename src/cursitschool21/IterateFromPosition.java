package cursitschool21;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateFromPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Carnat");
        list.add("Salam");
        list.add("Mezel");
        list.add("Paine");
        list.add("Coca-Cola");
        int startPosition = 2; // index starts from 0
        System.out.println("Iterating from position " + startPosition + ":");
        ListIterator<String> iterator = list.listIterator(startPosition);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}