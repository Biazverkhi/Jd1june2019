package Jd1june2019.Lection19.Task2;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        GarbageFactory garbageFactory = new GarbageFactory();
        Scientist scientist = new Scientist();
        ScientistHelper scientistHelper = new ScientistHelper(garbageFactory, scientist);
        garbageFactory.start();
        scientistHelper.start();
        while (scientist.yesAllItemsForOneRobot()) {
            scientist.buildRobot();

            scientistHelper.join();
        garbageFactory.join();
        }

            System.out.printf("Ученый построил %d роботов\n", scientist.getCountRobots());


    }


}
