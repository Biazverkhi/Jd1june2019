package Jd1june2019.Lection18;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

@Getter
@Setter
public class Task8 implements TemporalAdjuster {
    LocalDate date;
    LocalDate dat;

    public Task8() {
        this.date = LocalDate.now();
        this.dat = LocalDate.of(2019, 6, 25);
    }

    public static void main(String[] args) {
        Task8 objectData = new Task8();
        System.out.println("Дата без изменений " + objectData.getDate());
        System.out.println("Дата без изменений " + objectData.getDat());

        objectData.setDate((LocalDate) objectData.adjustInto(objectData.getDate()));
        objectData.setDat((LocalDate) objectData.adjustInto(objectData.getDat()));

        System.out.println("Дата с изменениями " + objectData.getDate());
        System.out.println("Дата с изменениями " + objectData.getDat());
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {// Тернарник, как Вы говорили:)
        return LocalDate.from(temporal).getMonthValue() > 6
                ? LocalDate.from(temporal).withMonth(1).withDayOfMonth(1).plusYears(1)
                : LocalDate.from(temporal).withMonth(1).withDayOfMonth(1);

    }
}