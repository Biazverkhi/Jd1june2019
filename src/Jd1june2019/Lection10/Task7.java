package Jd1june2019.Lection10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import static java.lang.Math.random;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ListIterator<Integer> iterator = list.listIterator();
        for (int i = 0; i < 9; i++) {//рандомно заполняем
            iterator.add((int) (random() * 31) - 15);
            System.out.print(list.get(i) + " ");//печать исходника
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < list.size(); i++) {//цикл перестановки
            if (list.get(i) >= 0 && list.size() - 1 - count > i) {//если больше нуля и дальше етсь смысл идти - пропускаем
                continue;
            } else if (list.get(i) < 0 && list.size() - 1 - count > i) {//если меньше нуля и не зашли в перенесенную часть -добавляем и убираем
                list.add(list.size(), list.get(i));
                list.remove(i);
                count++;
                i--;
            } else {
                for (int k = 0; k < list.size(); k++) {//печатаем результат
                    System.out.print(list.get(k) + " ");
                }
                break;
            }
        }


    }
}
