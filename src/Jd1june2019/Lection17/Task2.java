package Jd1june2019.Lection17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123456789","1234567","13245679899","13245","","1", "123456789","123","12345","123456","1234567890000");
        long count=list.stream()
                .filter(text -> text.length()>8)
                .distinct()
                .peek(text-> System.out.println(text))
                .count();
        System.out.println("количество уникальных элементов более 8 символов: "+count);
    }
}
