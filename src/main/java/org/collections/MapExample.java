package org.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

    public void touchMap() {

        Map<String, Integer> map = new HashMap<>();
        map.put("понедельник", 1);
        map.put("вторник", 2);
        map.put("среда", 3);

        System.out.println("map: " + map);

//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("понедельник", 1);
//        linkedMap.put("вторник", 2);
//        linkedMap.put("среда", 3);
//
//        System.out.println("linkedMap: " + linkedMap);

        Integer result = map.get("понедельник");
        System.out.println("result: " + result);

        map.remove("понедельник");
        System.out.println("map after remove: " + map);

        map.put("среда", 4);
        System.out.println("map after change: " + map);

        map.remove("среда", 4);
        System.out.println("map after remove with value: " + map);

        map.put("понедельник", 1);
        map.put("среда", 3);
        map.put("среда", 5);
        map.put("среда", 7);
        System.out.println("map after reput: " + map);


        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("entry: key - " + entry.getKey() + ", value - " + entry.getValue());
        }

        System.out.println("keys: " + map.keySet());
        System.out.println("values: " + map.values());

    }
}
