package Jd1june2019.Lection05;

import java.math.BigDecimal;

import static java.lang.Integer.valueOf;

public class Test {
    public static void main(String[] args) {
        Solver solver = new Solver(25.25, 24.24);
        double summa1=solver.sum(solver.getFirst(),solver.getTwo());
        BigDecimal summa2=solver.sum();
        System.out.println(summa1);
        System.out.println(summa2);
    }
}
