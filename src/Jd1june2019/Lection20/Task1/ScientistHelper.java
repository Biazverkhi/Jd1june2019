package Jd1june2019.Lection20.Task1;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.Math.random;

@Getter
public class ScientistHelper extends Thread {

    private Map<Item, Integer> itemsScientistHelper;
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
            }
        }

    }

    public synchronized void getItemsFromGarbareFactory() {
        int numberItemSH = (int) (random() * 4 + 1);//количество деталй для помошника
        Item[] itemsArray = Item.values();
        int numberItemGF = garbageFactory.getItemsGarbageFactory().entrySet().stream().collect(Collectors.summingInt(v -> v.getValue()));//количество деталей на фабрике
        int numberItem = numberItemSH <= numberItemGF ? numberItemSH : numberItemGF;//если на фабрике деталей меньше или нет, то помошник колько есть и забирает
        System.out.println(Thread.currentThread().getName()+"Помошник забирает "+numberItem);
        for (int i = 0; i < numberItem; i++) {//забираем детали из фабрики
            int randPosItem = (int) (random() * 9);
            if (garbageFactory.getItemsGarbageFactory().get(itemsArray[randPosItem]) !=null&&garbageFactory.getItemsGarbageFactory().get(itemsArray[randPosItem]) != 0) {
                garbageFactory.getItemsGarbageFactory().put(itemsArray[randPosItem], garbageFactory.getItemsGarbageFactory().get(itemsArray[randPosItem])-1);//удаляем из фабрики деталь, которую заносим к помошнику
                if (itemsScientistHelper.containsKey(itemsArray[randPosItem])) {
                    itemsScientistHelper.put(itemsArray[randPosItem], itemsScientistHelper.get(itemsArray[randPosItem]) + 1);
                } else {
                    itemsScientistHelper.put(itemsArray[randPosItem], 1);
                }
            } else {
                i--;
                continue;
            }
        }
        System.out.printf("%s Всего у помошника: %d деталей, MIN_POS: %d, разбивка по элементам:\n", Thread.currentThread().getName(), itemsScientistHelper.entrySet().stream().collect(Collectors.summingInt(v->v.getValue())), itemsScientistHelper.entrySet().stream().mapToInt(v->v.getValue()).min().getAsInt());
        System.out.println(Thread.currentThread().getName()+itemsScientistHelper.entrySet().stream().map(map -> map.getKey() + "=" + map.getValue()).collect(Collectors.joining(" | ")));

        garbageFactory.setFlagPutItemsOnGarbageFactory(false);
    }


}
