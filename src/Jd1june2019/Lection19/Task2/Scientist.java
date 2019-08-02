package Jd1june2019.Lection19.Task2;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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

    public void buildRobot() {//сборка одного робота если есть полный комплект деталей
            countRobots += 1;
            System.out.println("Ученый построил 1 робота");
            itemsForRobots.entrySet().stream().forEach(v -> v.setValue(v.getValue() - 1));
    }

    public boolean yesAllItemsForOneRobot() {//проверка комплектности деталей

        return itemsForRobots.entrySet().stream().filter(v -> v.getValue() != 0).count() == 9;
    }


}
























