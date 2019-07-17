package Jd1june2019.Lection11;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Marty", "Stepp");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Amanda", "Camp");
        map.put("Hal", "Perkins");

        Map<String, String> map2 = new HashMap<>();
        map2.put("Kendrick", "Perkins");
        map2.put("Stuart", "Reges");
        map2.put("Jessica", "Miller");
        map2.put("Bruce", "Reges");
        map2.put("Hal", "Perkins");

        boolean flag = isUnique(map);
        boolean flag2 = isUnique(map2);
        System.out.println("Карта map" + " : " + flag);
        printMap(map);
        System.out.println("Карта map2" + " : " + flag2);
        printMap(map2);


    }

    public static boolean isUnique(Map<String, String> map) {
        boolean flag = true;

        Collection<String> mapValue = map.values();//получаем из карты все значения
        Set<String> setMapValue = new HashSet<String>();//создаем множество на основе значений из map.
        setMapValue.addAll(mapValue);//зансим во множество все значения
        if (setMapValue.size() < map.size()) {//если были дубликаты - то во множестве стало меньше элементов. И значит флаг - false.
            flag = false;
        }

        return flag;
    }


    public static void printMap(Map<String, String> map) {

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry x : entrySet
        ) {
            System.out.printf("%-9s --->>>   %-9s\n", x.getKey(), x.getValue());
        }
        System.out.println();
    }
}
