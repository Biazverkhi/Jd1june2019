package Jd1june2019.Lection18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task4 {
    public static void main(String[] args) {
        String str = "26-03-2014";
        LocalDate date = LocalDate.parse(str, DateTimeFormatter.ofPattern("dd-MM-uuuu"));
    }
}
