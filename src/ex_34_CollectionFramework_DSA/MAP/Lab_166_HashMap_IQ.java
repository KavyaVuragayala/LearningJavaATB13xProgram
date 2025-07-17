package ex_34_CollectionFramework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab_166_HashMap_IQ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id",1);
        map.put("id",2);     // replaces the latest value
        map.put("id2",2);
        map.put("id3",34);
        map.put("id6",34);
        map.put("id9",null);
        map.put("id91",null);   // multiple null keys are allowed
        map.put(null,102);  // only one null value is allowed in hashmap
        map.put(null,100);   // override
        System.out.println(map);
        System.out.println(map.size());   // removes duplicates
        System.out.println(map.containsValue("id6"));

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.isEmpty());
    }
}
