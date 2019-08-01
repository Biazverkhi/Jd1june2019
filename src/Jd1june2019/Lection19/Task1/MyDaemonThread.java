package Jd1june2019.Lection19.Task1;

public class MyDaemonThread implements Runnable {


    @Override
    public void run() {

        System.out.printf("Стартовал демон поток %s\n", Thread.currentThread().getName());

        while (true) {
            try {
                Thread.sleep(5);
                System.out.println(MyThread.sum);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
