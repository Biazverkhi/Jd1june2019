package Jd1june2019.Lection18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class Task6 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate setDate = LocalDate.of(2020, 06, 25);
        LocalDateTime currentDT = LocalDateTime.of(currentDate, LocalTime.MIDNIGHT);
        LocalDateTime setDT = LocalDateTime.of(setDate, LocalTime.MIDNIGHT);
        long sec = setDT.toEpochSecond(ZoneOffset.UTC) - currentDT.toEpochSecond(ZoneOffset.UTC);
        System.out.println(sec);
    }

}
