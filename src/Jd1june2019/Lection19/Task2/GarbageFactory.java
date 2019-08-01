package Jd1june2019.Lection19.Task2;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.random;

public class GarbageFactory extends Thread {
    private Map<Item, Integer> itemGarbageFactory;
    private static int count = 0;
    private boolean flagFactory;


    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {//цикл 50 ночей
            addItemsOnGarbageFactory();//фабрика выкинула детали
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public  Map<Item, Integer> getItemGarbageFactory() {
        return itemGarbageFactory;
    }
    public boolean getFlagFactory() {
        return flagFactory;
    }

    public void clearGarbageFactory() {//метод очистки свалки
        itemGarbageFactory=null;
        flagFactory=false;
    }

    public  void  addItemsOnGarbageFactory() {//заполнение свалки
        itemGarbageFactory = new HashMap<>();
        int numItem = (count++ == 0) ? 20 : (int) (random() * 4 + 1);
        Item[] itemsArray = Item.values();
        for (int i = 0; i < numItem; i++) {
            int rand = (int) (random() * 9);
            if (itemGarbageFactory.containsKey(itemsArray[rand])) {
                itemGarbageFactory.put(itemsArray[rand], itemGarbageFactory.get(itemsArray[rand]) + 1);
            } else {
                itemGarbageFactory.put(itemsArray[rand], 1);
            }
        }
        if (!itemGarbageFactory.isEmpty()){flagFactory = true;}
        System.out.printf("Фабрика выбросила %d деталей\n", numItem);
    }
}





