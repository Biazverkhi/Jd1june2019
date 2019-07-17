package Jd1june2019.Lection11.Task3;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.random;


public abstract class CreateMap {


    public static Map<Integer, Integer> createMap(Input input) {

        Map<Integer, Integer> map = new HashMap<>();
        int i = input.getInputN();
        while (i >= 0) {//рандомное заполнение массива
            int v = (int) (random() * (input.getInputN() * 10) + 1);
            if (!map.containsValue(v) && v != 0 && v != 1) {
                map.put(i, v);
                i--;
            }
        }

        //рандомное удаление нескльких пар в зависимости от размера массива/ Для красоты

        if (input.getInputN() > 3 && input.getInputN() <= 7) {
            map.remove((int) (random() * input.getInputN() + 1));
        } else if (input.getInputN() > 7 && input.getInputN() < 10) {
            int t = 3;
            while (t >= 0) {
                map.remove((int) (random() * input.getInputN() + 1));
                t--;
            }

        } else if (input.getInputN() / 5 >= 2) {
            int j = (input.getInputN() / 5) * 2;

            do {
                map.remove((int) (random() * input.getInputN() + 1));
                j--;
            } while (j > 0);


        }


        return map;
    }


}



