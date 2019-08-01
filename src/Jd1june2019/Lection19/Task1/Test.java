package Jd1june2019.Lection19.Task1;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread myDaemonThread = new Thread(new MyDaemonThread());
        myThread.start();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();


    }
}
