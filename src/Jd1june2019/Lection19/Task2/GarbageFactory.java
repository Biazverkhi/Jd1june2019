package Jd1june2019.Lection19.Task2;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.Math.random;
@Setter
@Getter
public class GarbageFactory extends Thread {
    private Map<Item, Integer> itemsGarbageFactory ;
    private static int count = 0;
    private boolean flagPutItemsOnGarbageFactory=false;

    public GarbageFactory() {
        itemsGarbageFactory = new HashMap<>();
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {//цикл 50 ночей
            putItemsOnGarbageFactory();//фабрика выкинула детали
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void putItemsOnGarbageFactory() {//заполнение свалки
        int numItem = (count++ == 0) ? 20 : (int) (random() * 4 + 1);
        Item[] itemsArray = Item.values();
        for (int i = 0; i < numItem; i++) {
            int rand = (int) (random() * 9);
            if (itemsGarbageFactory.containsKey(itemsArray[rand])) {
                itemsGarbageFactory.put(itemsArray[rand], itemsGarbageFactory.get(itemsArray[rand]) + 1);
            } else {
                itemsGarbageFactory.put(itemsArray[rand], 1);
            }
        }
        flagPutItemsOnGarbageFactory=true;

        System.out.printf("Всего на фабрике: %d, разбивка по элементам:\n", itemsGarbageFactory.entrySet().stream().collect(Collectors.summingInt(map -> map.getValue())));
        System.out.println(itemsGarbageFactory.entrySet().stream().map(map -> map.getKey() + "=" + String.join(", ", String.valueOf(map.getValue()))).collect(Collectors.joining(" | ")));
    }

    public synchronized Map<Item, Integer>  getItemsGarbageFactory() {
        return itemsGarbageFactory;
    }
}





