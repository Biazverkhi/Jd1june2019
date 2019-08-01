package Jd1june2019.Lection19.Task2;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ScientistHelper extends Thread {
    public Map<Item, Integer> itemsScientistHelper;
    private GarbageFactory garbageFactory;
    private Scientist scientist;

    public ScientistHelper(GarbageFactory garbageFactory, Scientist scientist) {
        this.garbageFactory = garbageFactory;
        this.scientist = scientist;
    }
    @Override
    public void run() {
        while (garbageFactory.isAlive()) {
            if (garbageFactory.getFlagFactory()){
               itemsScientistHelper = new HashMap<>();
               itemsScientistHelper = garbageFactory.getItemGarbageFactory();//помошник пошел на свалку за деталям
              // System.out.printf("Помошник нашел %d деталей\n", itemsScientistHelper.entrySet().stream().collect(Collectors.summingInt(v->v.getValue())));
               garbageFactory.clearGarbageFactory();//удалил забранные детали из мап фабрики
              addItemsForRobots();//помошник вручает деталиученому
               itemsScientistHelper.clear();}

        }
    }

    public void addItemsForRobots() {
        for (Map.Entry<Item, Integer> item : itemsScientistHelper.entrySet()) {
            if (scientist.getItemsForRobots().containsKey(item.getKey())) {
                scientist.getItemsForRobots().put(item.getKey(), scientist.getItemsForRobots().get(item.getKey()) + item.getValue());
            } else {
                scientist.getItemsForRobots().put(item.getKey(), item.getValue());
            }
        }
        System.out.printf("Ученый имеет %d деталей\n", scientist.getItemsForRobots().entrySet().stream().collect(Collectors.summingInt(value -> value.getValue())));
    }//помошник отдал детали ученому. Ученый их добавляет к своей мастерской



}
