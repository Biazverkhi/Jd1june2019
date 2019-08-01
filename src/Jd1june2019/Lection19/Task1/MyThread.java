package Jd1june2019.Lection19.Task1;


public class MyThread extends Thread {
    public static long sum = 0;

    public MyThread() {
        super("MyThread11");
    }

    @Override
    public void run() {
        System.out.printf("Поток %s стартовал\n", Thread.currentThread().getName());
        for (int i = 0; i < 10000000; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                sum += i;
                if (i % 1000000 == 0) {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.printf("Поток %s финишировал\n", Thread.currentThread().getName());
    }
}
