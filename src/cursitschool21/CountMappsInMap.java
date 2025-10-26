package cursitschool21;

import java.util.HashMap;

public class CountMappsInMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        int size = map.size();
        System.out.println("Number of key-value mappings in the map: " + size);
    }
}