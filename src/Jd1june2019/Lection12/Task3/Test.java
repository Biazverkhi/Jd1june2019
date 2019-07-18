package Jd1june2019.Lection12.Task3;

public class Test {


    public static void main(String[] args) {
        try {
            divNull();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void divNull() throws MyException {
        int i = 0;
        if (i == 0) throw new MyException();

        int x = 5 / i;


    }


}
