package cursitschool21;

import java.util.TreeSet;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        System.out.println("Original TreeSet: " + treeSet);
        String elementToRemove = "Banana";
        boolean removed = treeSet.remove(elementToRemove);
        if (removed) {
            System.out.println("Removed element: " + elementToRemove);
        } else {
            System.out.println("Element not found: " + elementToRemove);
        }
        System.out.println("TreeSet after removal: " + treeSet);
    }
}