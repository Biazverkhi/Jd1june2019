package Jd1june2019.Lection05;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class Solver {

    private double first;
    private double two;
    private BigDecimal firstBigDecimal;
    private BigDecimal twoBigDecimal;

    public Solver(double first, double two) {
        this.first = first;
        this.two = two;
        firstBigDecimal = BigDecimal.valueOf(first);
        twoBigDecimal = BigDecimal.valueOf(two);
    }

    public double sum(double first, double two) {
        double three = first+two;
        return three;
    }

    public BigDecimal sum() {
        BigDecimal threeBigDecimal = firstBigDecimal.add(twoBigDecimal);

        return threeBigDecimal;
    }

}
