package Jd1june2019.Lection04;

public class Task1_Test {
    public static void main(String[] args) {
        Task1_PeriodOfTime time=new Task1_PeriodOfTime(485698);
        time.toString();


        int seconds=time.getSecondAll();
        System.out.println(seconds);

        Task1_PeriodOfTime time2=new Task1_PeriodOfTime(28, 46,56);
        time2.toString();

        int seconds2=time2.getSecondAll();
        System.out.println(seconds2);

    }

}
