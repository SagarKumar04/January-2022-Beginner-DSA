package Introduction.HashMap;

import java.util.HashMap;
import java.util.Map;

public class EntrySetExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        System.out.println("HashCode: " + map.hashCode());

        map.put("aaa", 2);
        map.put("bbb", 1);
        map.put("Aa", 100);
        map.put("ccc", 3);
        map.put("BB", 12);
        map.put("key1", 22);
        map.put("key2", 32);
        map.put("key3", 42);
        map.put("key4", 52);
        map.put("key5", 62);
        map.put("key6", 72);
        map.put("key7", 92);
        map.put("key8", 92);

        System.out.println("Map: " + map);

        Integer searchElement = 92;
        for(Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String key = eachEntry.getKey();
            Integer value = eachEntry.getValue();

            if(value == searchElement) {
                System.out.println("Key: " + key);
            }
        }
    }
}
