package Jd1june2019.Lection11.Task3;

import java.util.Map;
import java.util.Set;

public abstract class Print {
    public static void printChlen(Map<Integer, Integer> map) {

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        StringBuilder text = new StringBuilder();

        for (Map.Entry<Integer, Integer> x : entrySet
        ) {
            if (x.getKey() == 0) {
                text = text.insert(0, x.getValue());
            } else if (x.getKey() == 1) {
                text = text.insert(0, x.getValue() + "x+");
            } else {
                text = text.insert(0, (x.getValue() + "x^" + x.getKey() + "+"));
            }
        }
        System.out.println(text);
    }
}
