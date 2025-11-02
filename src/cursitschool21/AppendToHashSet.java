package cursitschool21;

import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        System.out.println("HashSet after adding an element: " + set);
    }
}