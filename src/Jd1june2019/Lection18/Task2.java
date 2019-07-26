package Jd1june2019.Lection18;

import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate newDate = date.plusMonths(3);
        System.out.println(date);
        System.out.println(newDate);
    }
}
