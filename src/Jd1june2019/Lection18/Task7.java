package Jd1june2019.Lection18;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.temporal.ChronoUnit.DAYS;

@Getter
@Setter
public class Task7 implements TemporalAdjuster {
    LocalDate date;

    public Task7() {
        this.date = LocalDate.now();
    }

    public static void main(String[] args) {
        Task7 objectData = new Task7();
        System.out.println(objectData.getDate());
        objectData.setDate((LocalDate) objectData.adjustInto(objectData.getDate()));
        System.out.println(objectData.getDate());
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(42, DAYS);
    }//есть вариант проще. Принцип решения есть в задаче Task8
}