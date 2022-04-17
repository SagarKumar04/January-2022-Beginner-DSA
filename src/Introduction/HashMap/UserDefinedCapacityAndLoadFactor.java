package Introduction.HashMap;

import java.util.HashMap;
import java.util.Map;

public class UserDefinedCapacityAndLoadFactor {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>(40, 0.1f);

        map.put("AAA", 111);
        map.put("BBB", 222);
        map.put("CCC", 333);
        map.put("DDD", 444);

        System.out.println(map);
    }
}