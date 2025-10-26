package cursitschool21;

import java.util.TreeMap;

public class FirstAndLastKey {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "Red");
        map.put(20, "Green");
        map.put(30, "Blue");
        map.put(40, "Yellow");
        int firstKey = map.firstKey();
        int lastKey = map.lastKey();
        System.out.println("TreeMap: " + map);
        System.out.println("Lowest key: " + firstKey);
        System.out.println("Highest key: " + lastKey);
    }
}