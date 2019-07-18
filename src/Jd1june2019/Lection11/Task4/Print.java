package Jd1june2019.Lection11.Task4;

import java.util.Iterator;
import java.util.List;

public abstract class Print {
    public static void printList(List<Integer> list) {

        Iterator <Integer> iterator =list.iterator();
   while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

    }



    public static void printBox(Black_Box box) {
        Iterator <Integer> iterator =box.getBlackList().iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

    }

}
