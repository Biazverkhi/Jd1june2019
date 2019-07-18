package Jd1june2019.Lection11.Task4;


import lombok.Getter;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import static Jd1june2019.Lection11.Task4.Input.inputNumber;
import static java.lang.Math.random;
@Getter
public class Black_Box {
    private List<Integer> blackList;

    public Black_Box() {
        blackList = new LinkedList<Integer>();
        ListIterator<Integer> iterator = blackList.listIterator();//может итератор надо выносить в поле?
        for (int i = 0; i < 20; i++) {//рандомно заполняем
            iterator.add((int) (random() * 101) - 50);
           }

        Collections.sort(blackList);//сортируем
        Print.printList(blackList);
    }

    public void addNumberInBlack_Box() {//метод добавления числа
     int number=inputNumber();
     blackList.listIterator().add(number);
        Collections.sort(blackList);//сортируем
        Print.printList(blackList);

    }

public int kMin (int kMin){//метод
   int minK=blackList.get(kMin-1);
return minK;}

    public int nMax (int nMax){
        int maxN=blackList.get(blackList.size()-nMax);
        return maxN;}

}
