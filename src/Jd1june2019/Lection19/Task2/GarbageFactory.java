package Jd1june2019.Lection19.Task2;


import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.random;

public class GarbageFactory {
    private Map<Item, Integer> itemGarbageFactory;

    public Map<Item, Integer> getItemGarbageFactory() {
        return itemGarbageFactory;
    }

    public void clearGarbageFactory() {//метод очистки свалки
        itemGarbageFactory = null;
    }

    public void addItemsOnGarbageFactory(int numNight) {//заполнение свалки
        itemGarbageFactory = new HashMap<>();
        int numItem = (numNight == 0) ? 20 : (int) (random() * 4 + 1);
        Item[] itemsArray = Item.values();
        for (int i = 0; i < numItem; i++) {
            int rand = (int) (random() * 9);
            if (itemGarbageFactory.containsKey(itemsArray[rand])) {
                itemGarbageFactory.put(itemsArray[rand], itemGarbageFactory.get(itemsArray[rand]) + 1);
            } else {
                itemGarbageFactory.put(itemsArray[rand], 1);
            }
        }
        // System.out.printf("Фабрика выбросила %d деталей\n", itemGarbageFactory.entrySet().stream().collect(Collectors.summingInt(value -> value.getValue())));
    }
}





