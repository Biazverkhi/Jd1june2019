package Jd1june2019.Lection10;

import java.util.Set;
import java.util.TreeSet;

public class Task5 {
    public static void main(String... args) {

        Set<Integer> set = new TreeSet<>(); //полный спсок
        Set<Integer> setEven = new TreeSet<>();// четный список для демонтрации
        Set<Integer> setUneven = new TreeSet<>();//нечетный для демо
      //  Set<Integer> setAdd = new TreeSet<>();
        Set<Integer> setRetail = new TreeSet<>();


        for (int i = 0; i < 9; i++) {//заполнения 3 тестовых множеств
            set.add(i);
            if (i % 2 == 0) {
                setEven.add(i);
            } else {
                setUneven.add(i);
            }
        }

        addSet(setEven,setUneven);//вызов объединения
        setRetail=setRetail(set, setUneven);//вызов пересечения
        System.out.println("stop debug");
    }


    public static Set<Integer> addSet(Set <Integer> set, Set <Integer> set2){
        set.addAll(set2);
    return set;}//объединение

    public static Set<Integer> setRetail(Set <Integer> set, Set <Integer> set2){
        set.retainAll(set2);
        return set;}//пересечение


}
