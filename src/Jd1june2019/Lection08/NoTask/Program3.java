package Jd1june2019.Lection08.NoTask;

public class Program3 {

    public static void main(String[] args) {

        Accountable2<String> acc1 = new Account2("1235rwr", 5000);
        Account acc2 = new Account("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}

interface Accountable2<T> {
    T getId();

    int getSum();

    void setSum(int sum);
}

class Account2 implements Accountable2<String> {

    private String id;
    private int sum;

    Account2(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}