package Jd1june2019.Lection18;

import java.time.LocalDate;

public class Task5 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate setDate = LocalDate.of(2020, 06, 25);
        System.out.println(setDate.toEpochDay() - currentDate.toEpochDay());


    }
}
