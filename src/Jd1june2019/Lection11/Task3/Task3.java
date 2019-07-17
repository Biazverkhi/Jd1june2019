package Jd1june2019.Lection11.Task3;

import java.util.Map;
import static Jd1june2019.Lection11.Task3.CreateMap.createMap;
import static Jd1june2019.Lection11.Task3.Sum.sumChlen;
import static Jd1june2019.Lection11.Task3.Print.printChlen;


public class Task3 {
    public static void main(String[] args) {
        Input input=new Input();
Map<Integer, Integer> map=createMap(input);
        Map<Integer, Integer> map1=createMap(input);

        System.out.println(map);
        System.out.println(map1);

map=sumChlen(map,map1);
        System.out.println("сумма многочлена");
        System.out.println(map);
        printChlen(map);


    }
}
