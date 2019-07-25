package Jd1june2019.Lection17;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("12434",2); map.put("2341",3); map.put("12345678",25); map.put("123423",25); map.put("44444",25);
         int sum=map.entrySet().stream()
        .filter(k->k.getKey().length()<7)
        .collect(Collectors.summingInt(value -> value.getValue()));
        System.out.println(sum);
    }
}
