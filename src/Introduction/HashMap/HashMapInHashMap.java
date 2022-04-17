package Introduction.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapInHashMap {
    public static void main(String[] args) {
        Map<String, HashMap<String, Integer>> map = new HashMap<String, HashMap<String, Integer>>();

        String key1 = "ABCDEF";
        HashMap<String, Integer> value1 = new HashMap<String, Integer>();
        value1.put("AAA", 111);
        value1.put("BBB", 222);
        map.put(key1, value1);

        String key2 = "GHIJKL";
        HashMap<String, Integer> value2 = new HashMap<String, Integer>();
        value2.put("CCC", 333);
        value2.put("DDD", 444);
        value2.put("EEE", 555);
        map.put(key2, value2);

        System.out.println("Map: " + map);
    }
}
