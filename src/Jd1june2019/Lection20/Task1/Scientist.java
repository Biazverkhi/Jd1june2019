package Jd1june2019.Lection20.Task1;

import Jd1june2019.Lection20.Task1.Item;
import Jd1june2019.Lection20.Task1.ScientistHelper;
import lombok.Getter;

import java.util.Map;

@Getter
public class Scientist {
    private Map<Item, Integer> itemsForRobots;
    private int countRobots;
    private ScientistHelper scientistHelper;

    public Scientist(ScientistHelper scientistHelper) {
        int countRobots = 0;
        itemsForRobots =scientistHelper.getItemsScientistHelper();
        this.scientistHelper=scientistHelper;
    }

    public  void buildRobot() {//сборка одного робота если есть полный комплект деталей
           if (yesAllItemsForOneRobot()){
            countRobots += 1;
           // System.out.println("Ученый построил 1 робота");
            itemsForRobots.entrySet().stream().forEach(v -> v.setValue(v.getValue() - 1));
    }}

    public  boolean yesAllItemsForOneRobot() {//проверка комплектности деталей

        return (!itemsForRobots.containsValue(0))&&itemsForRobots.size()==9;
    }


}
























