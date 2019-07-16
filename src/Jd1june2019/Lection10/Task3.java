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
while (iterator.hasPrevious())//1 варинат
{ System.out.printf("%-3d",iterator.previous());}
            System.out.println();

       for (int i=list.size()-1;i>=0;i--)
       {System.out.printf("%-3d",list.get(i));}//2 вариант обатного вывода.
    }
}
