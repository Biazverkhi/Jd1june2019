package Jd1june2019.Lection10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ListIterator<Integer> iterator = list.listIterator();
        for (int i = 0; i < 10; i++) {
            iterator.add(new Random().nextInt(10) + 1);
        }

        for (ListIterator<Integer> iterator2 = list.listIterator(); iterator2.hasPrevious(); ) {

            // System.out.printf("%-3d",iterator2.next());
            //System.out.println();
            System.out.printf("%-3d", iterator2.previous());

        }

    }
}
