package Jd1june2019.Lection19.Task2;


import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.Math.random;
@Getter
public class ScientistHelper extends Thread {
    public Map<Item, Integer> itemsScientistHelper;
    private GarbageFactory garbageFactory;

    public ScientistHelper(GarbageFactory garbageFactory) {
        this.garbageFactory = garbageFactory;
        itemsScientistHelper = new HashMap<>();
    }
    @Override
    public void run() {
        while (garbageFactory.isAlive()) {
            if (garbageFactory.isFlagPutItemsOnGarbageFactory()) {
                   getItemsFromGarbareFactory();
                 System.out.printf("Помошник нашел %d деталей\n", itemsScientistHelper.entrySet().stream().collect(Collectors.summingInt(v->v.getValue())));
                //  addItemsForRobots();//помошник вручает деталиученому
            }
        }

    }

    public void getItemsFromGarbareFactory() {
        int numberItemSH = (int) (random() * 4 + 1);//количество деталй для помошника
        Item[] itemsArray = Item.values();
        int numberItemGF = garbageFactory.getItemsGarbageFactory().entrySet().stream().collect(Collectors.summingInt(v -> v.getValue()));//количество деталей на фабрике
        System.out.println("деталей на фабрике до помошника "+numberItemGF);
        int numberItem = numberItemSH <= numberItemGF ? numberItemSH : numberItemGF;//если на фабрике деталей меньше или нет, то помошник колько есть и забирает
        System.out.println("помошник взял"+numberItem);
        for (int i = 0; i < numberItem; i++) {//забираем детали из фабрики
            int randPosItem = (int) (random() * 9);
            if (garbageFactory.getItemsGarbageFactory().get(randPosItem) != 0) {
                garbageFactory.getItemsGarbageFactory().put(itemsArray[randPosItem], garbageFactory.getItemsGarbageFactory().get(itemsArray[randPosItem])-1);//удаляем из фабрики деталь, которую заносим к помошнику
                if (itemsScientistHelper.containsKey(randPosItem)) {
                    itemsScientistHelper.put(itemsArray[randPosItem], itemsScientistHelper.get(randPosItem) + 1);
                } else {
                    itemsScientistHelper.put(itemsArray[randPosItem], 1);
                }
            } else {
                i--;
                continue;

            }
        }
        garbageFactory.setFlagPutItemsOnGarbageFactory(false);
        System.out.println("детали на фабрике после помошника "+garbageFactory.getItemsGarbageFactory().entrySet().stream().collect(Collectors.summingInt(map -> map.getValue())));
        System.out.println("детали помошника "+itemsScientistHelper.entrySet().stream().collect(Collectors.summingInt(map -> map.getValue())));



    }



}
