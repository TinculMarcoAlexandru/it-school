package cursitschool21;

import java.util.TreeSet;

public class RemoveFirstElement {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        System.out.println("Original TreeSet: " + treeSet);
        String firstElement = treeSet.pollFirst();
        System.out.println("Removed first element: " + firstElement);
        System.out.println("TreeSet after removal: " + treeSet);
    }
}