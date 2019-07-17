package Jd1june2019.Lection11.Task3;

import java.util.Map;
import java.util.Set;

public abstract class Sum {


    public static Map<Integer, Integer> sumChlen(Map<Integer, Integer> map, Map map1) {
        Set<Map.Entry<Integer, Integer>> entrySet = map1.entrySet();
        for (Map.Entry<Integer,Integer> x : entrySet
        ) {
            int kMap1=x.getKey();
            int vMap1=x.getValue();
            if (!map.containsKey(kMap1)) {
                map.put(kMap1, vMap1);
            } else {
                map.put(kMap1, map.get(kMap1) + vMap1);

            }

        }


        return map;
    }


}
