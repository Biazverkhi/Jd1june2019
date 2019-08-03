package Jd1june2019.Lection20.Task1;

import Jd1june2019.Lection20.Task1.GarbageFactory;
import Jd1june2019.Lection20.Task1.Scientist;
import Jd1june2019.Lection20.Task1.ScientistHelper;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        GarbageFactory garbageFactory = new GarbageFactory();
        ScientistHelper scientistHelper = new ScientistHelper(garbageFactory);
       ScientistHelper scientistHelper2 = new ScientistHelper(garbageFactory);
        Scientist scientist = new Scientist(scientistHelper);
        Scientist scientist2 = new Scientist(scientistHelper2);
        garbageFactory.start();

        Thread thread = new Thread(scientistHelper);
        Thread thread1 = new Thread(scientistHelper2);
        thread.setName("№1");
        thread1.setName("№2");
        thread.start();
        thread1.start();

        while (thread.isAlive()||thread1.isAlive()) {
            scientist.buildRobot();
            scientist2.buildRobot();

        }
            System.out.printf("Ученый1 построил %d роботов\n", scientist.getCountRobots());
            System.out.printf("Ученый2 построил %d роботов\n", scientist2.getCountRobots());


    }


}
