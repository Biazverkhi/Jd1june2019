package Jd1june2019.Lection19.Task2;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        GarbageFactory garbageFactory = new GarbageFactory();
        ScientistHelper scientistHelper = new ScientistHelper(garbageFactory);

        Scientist scientist = new Scientist(scientistHelper);
        garbageFactory.start();
        scientistHelper.start();
        while (scientistHelper.isAlive()) {
            scientist.stgbuildRobot();

        }

            System.out.printf("Ученый построил %d роботов\n", scientist.getCountRobots());


    }


}
