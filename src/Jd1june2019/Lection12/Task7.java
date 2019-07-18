package Jd1june2019.Lection12;

import static java.lang.Math.random;

public class Task7 {


    public static void main(String[] args) {
        try {
            randomExteption();
        } catch (ArithmeticException e) {
            System.out.println("Поделили на ноль!!!");
            e.printStackTrace();
        }
        finally {
            System.out.println("это выполниться в любом случае");

    }}

    public static void randomExteption() {
        int i = (int) (random()*2);
        if (i ==0) {
            int x = 5 / 0;
        }

    }
}


