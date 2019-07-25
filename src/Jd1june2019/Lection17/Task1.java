package Jd1june2019.Lection17;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


public class Task1 {
    public static void main(String[] args) {
       List<Integer> list= Arrays.asList(12,15,56,55,78,56,55,47);
               OptionalDouble sum=list.stream()
                .filter(element -> element %2 !=0||element %5 ==0)
                .mapToDouble(element -> element)
                .average();
    }
}
