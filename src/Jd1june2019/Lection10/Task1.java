package Jd1june2019.Lection10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ListIterator<Integer> iterator = list.listIterator();
        for (int i = 0; i < 29; i++) {
            iterator.add(new Random().nextInt(10)+1);
        }

        for (ListIterator<Integer> it = list.listIterator(); it.hasNext(); ) {//удаляем плохие оценки. Подзадача 1.
            if (it.next() < 6) {
                it.remove();
            }

        }

    }

}




