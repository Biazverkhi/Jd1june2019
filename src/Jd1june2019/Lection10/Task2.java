package Jd1june2019.Lection10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ListIterator<Integer> iterator = list.listIterator();
        for (int i = 0; i < 29; i++) {
            iterator.add(new Random().nextInt(10)+1);
        }
        int count = 0;
        ;
        for (ListIterator<Integer> it = list.listIterator(); it.hasNext(); ) {//ищем максимальную оценку
            int a = it.next();
            if (a > count) {
                count = a;
            }

        }
        System.out.println(count);
    }


}
