package Jd1june2019.Lection09;

//import java.math.BigDecimal;

import java.math.BigDecimal;

public class Test05 {
    public static void main(String[] args) {
        Solver05 <Integer> objInteger = new Solver05<>(25, 24);
        Solver05 <Double> objDouble = new Solver05<>(25.25, 24.24);
       BigDecimal summa1=objInteger.sum();
       BigDecimal summa2=objDouble.sum();
        double summa3=objDouble.sum2();

        System.out.println(summa1);
        System.out.println(summa2);
        System.out.println(summa3);
    }
}
