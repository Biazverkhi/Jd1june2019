package Jd1june2019.Lection19.Task2;

public class Test {
    public static void main(String[] args) {
        new Thread(() -> {
            GarbageFactory garbageFactory = new GarbageFactory();
            ScientistHelper scientistHelper = new ScientistHelper();
            Scientist scientist = new Scientist();
            for (int i = 0; i < 50; i++) {//цикл 50 ночей

                garbageFactory.addItemsOnGarbageFactory(i);//фабрика выкинула детали
                scientistHelper.goToItemsFromGarbageFactory(garbageFactory);//помошник забрал детали у фабрики
                scientistHelper.addItemForScientist(scientist);//помошник передал запчасти ученому
                scientist.buildRobot();//ученый производит сборку
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.printf("Ученый построил %d роботов\n", scientist.getCountRobots());
        }).start();


    }


}
