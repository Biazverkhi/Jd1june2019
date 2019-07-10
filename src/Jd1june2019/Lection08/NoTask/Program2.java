package Jd1june2019.Lection08.NoTask;

public class Program2 {

    public static void main(String[] args) {

        Account<String> acc1 = new Account<String>("1235rwr", 5000);
        Account<Integer> acc2 = new Account<Integer>(2565, 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}

interface Accountable<T> {
    T getId();

    int getSum();

    void setSum(int sum);
}

class Account<T> implements Accountable<T> {

    private T id;
    private int sum;

    Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}