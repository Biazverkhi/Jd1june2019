package Jd1june2019.Lection02;

public class Task4 extends Task3 {

    public static void main(String[] args) {
        //Task3 task4 = new Test();
        int day = input();
        int month = input();
        int year = input();
        boolean yearChek = yearCheckVisokos(year);// выясняем високосный год или нет
        boolean dataCheck = dataCheckReal(day, month, year, yearChek);//выясняем реальная дата или нет

        if (dataCheck) System.out.printf("дата %s.%s.%s реальная", day, month, year);
        else System.out.printf("дата %s.%s.%s не реальная", day, month, year);

    }

    static boolean dataCheckReal(int day, int month, int year, boolean yearChek) {
        boolean dataCheck = true;
        if (year < 0 || day < 0 || day > 31 || month < 0 || month > 12 || (day > 28 && month == 2 && !yearChek) || (day > 29 && month == 2 && yearChek) || (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)))
            dataCheck = false;
        else ;


        return dataCheck;
    }

}

