package Jd1june2019.Lection18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd.MM.uuuu")));


    }
}
