package Jd1june2019.Lection09;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class Solver05<T extends Number> {

    private T first;
    private T two;

    public Solver05(T first, T two) {
        this.first = first;
        this.two = two;
    }

    public <T extends Number> BigDecimal sum() {
        BigDecimal three =  BigDecimal.valueOf(getFirst().doubleValue()).add(BigDecimal.valueOf(getTwo().doubleValue()));

        return three;
    }
    public <T extends Number> double sum2() {//для сравнения сделал.
        double three =  getFirst().doubleValue()+getTwo().doubleValue();

        return three;
    }


}
