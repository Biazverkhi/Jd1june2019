package Jd1june2019.Lection19.Task2;


import java.util.HashMap;
import java.util.Map;

public class ScientistHelper {
    public Map<Item, Integer> itemsScientistHelper;

    public void goToItemsFromGarbageFactory(GarbageFactory garbageFactory) {//помошник пошел на свалку за деталями
        itemsScientistHelper = new HashMap<>();
        this.itemsScientistHelper = garbageFactory.getItemGarbageFactory();
        //   System.out.printf("Помошник нашел %d деталей\n", itemsScientistHelper.entrySet().stream().collect(Collectors.summingInt(v->v.getValue())));
        garbageFactory.clearGarbageFactory();//удалил забранные детали из мап фабрики
    }

    public void addItemForScientist(Scientist scientist) {//помошник вручает деталиученому
        scientist.addItemsForRobots(itemsScientistHelper);
        itemsScientistHelper = null;
    }
}
