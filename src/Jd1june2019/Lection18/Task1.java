package Jd1june2019.Lection18;

import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 06, 25);
        System.out.printf("%d.%02d.%d\n", localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear());
        System.out.println(localDate);
    }
}
