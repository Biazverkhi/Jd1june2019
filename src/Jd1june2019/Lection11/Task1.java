package Jd1june2019.Lection11;

import java.util.*;

import static java.lang.Math.random;

public class Task1 {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        ListIterator<Integer> iterator = list.listIterator();
        for (int i = 0; i < 15; i++) {//рандомно заполняем
            iterator.add((int) (random() * 31) - 15);
            System.out.print(list.get(i) + " ");//печать исходника
        }
        System.out.println();
        System.out.println("Всего чисел "+list.size()+" среди них "+countUnique(list)+" уникальных");

    }

public static int countUnique(List<Integer> list){
    Set<Integer> setCount =new HashSet<>();
setCount.addAll(list);//закидываю в Сет
return setCount.size();}//оотуда возвращаем уникальные значение (их кол-во)
}

