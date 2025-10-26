package cursitschool21;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Yellow");
        System.out.println("Iterating through all elements:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}