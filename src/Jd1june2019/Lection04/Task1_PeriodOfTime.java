package Jd1june2019.Lection04;

public class Task1_PeriodOfTime {
    private int sec;
    private int min;
    private int hour;

    public int getSecondAll() {//возвращает все секунды.
        int seconAll = hour * 60 * 60 + min * 60 + sec;
        return seconAll;
    }

    public Task1_PeriodOfTime(int secondAll) {//первый конструктор
        this.hour = secondAll / (3600);
        this.min = secondAll % 3600 / 60;
        this.sec = secondAll % 3600 % 60;
    }

    public Task1_PeriodOfTime(int hour, int min, int sec) {//второй конструктор
        this.hour = hour;
        this.min = min;
        this.sec = sec;

    }

    public String toString() {//выводит на печать

        System.out.printf("%02d:%02d:%02d\n", hour,min,sec);


   return super.toString(); }
}