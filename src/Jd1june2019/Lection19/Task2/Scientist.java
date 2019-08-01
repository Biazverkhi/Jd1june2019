package Jd1june2019.Lection19.Task2;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
public class Scientist {
    private Map<Item, Integer> itemsForRobots;
    private int countRobots;

    public Scientist() {
        int countRobots = 0;
        itemsForRobots = new HashMap<>();
    }
    public int getCountRobots() {
        return countRobots;
    }

    public void addItemsForRobots(Map<Item, Integer> itemsFromScientistHelper) {

        for (Map.Entry<Item, Integer> item : itemsFromScientistHelper.entrySet()) {
            if (itemsForRobots.containsKey(item.getKey())) {
                itemsForRobots.put(item.getKey(), itemsForRobots.get(item.getKey()) + item.getValue());
            } else {
                itemsForRobots.put(item.getKey(), item.getValue());

            }
        }

        System.out.printf("Ученый имеет %d деталей\n", itemsForRobots.entrySet().stream().collect(Collectors.summingInt(value -> value.getValue())));
    }//помошник отдал детали ученому. Ученый их добавляет к своей мастерской

    public void buildRobot() {//сборка одного робота если есть полный комплект деталей
        while (yesAllItemsForOneRobot()) {
            countRobots += 1;
            System.out.println("Ученый построил 1 робота");
            minusItemsForRobots();//удалить использованные детали из мапы ученого
        }

    }

    private boolean yesAllItemsForOneRobot() {//проверка комплектности деталей

        return itemsForRobots.entrySet().stream().filter(v -> v.getValue() != 0).count() == 9;
    }

    private void minusItemsForRobots() {//удаление деталей из мастеркой после сборки 1 робота
        itemsForRobots.entrySet().stream().forEach(v -> v.setValue(v.getValue() - 1));


    }
}
























