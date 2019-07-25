package Jd1june2019.Lection17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6, 5, 4, 3, 2, 1, 2, 3, 4);
       String text = list.stream()
                .map(s -> String.valueOf(s))
                .collect(Collectors.joining());
        System.out.println(text);
    }
}
