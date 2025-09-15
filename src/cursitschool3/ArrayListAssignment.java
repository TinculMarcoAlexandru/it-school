package cursitschool3;

import java.util.ArrayList;

public class ArrayListAssignment {
    public static void main(String[] args) {
        // Create first list
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Spart");
        listOne.add("Iarba");
        listOne.add("Copil");

        // Assign listOne to listTwo (both point to the same object now)
        ArrayList<String> listTwo = listOne;

        // Modify listOne
        listOne.add("Data");

        // Print both lists
        System.out.println("listOne: " + listOne);
        System.out.println("listTwo: " + listTwo);
    }
}


