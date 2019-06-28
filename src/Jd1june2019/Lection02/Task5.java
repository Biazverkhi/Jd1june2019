package Jd1june2019.Lection02;

public class Task5 extends Task4 {

    public static void main(String[] args) {
        int day = input();
        int month = input();
        int year = input();
        int newDay;
        int newMonth;
        int newYear;
        boolean yearChek = yearCheckVisokos(year);// выясняем високосный год или нет
        boolean dataCheck = dataCheckReal(day, month, year, yearChek);//выясняем реальная дата или нет

        if (dataCheck)
            print("Введенная дата действительна");
        else print("Введенная дата не действительна");
        int[] newDate = new int[3];
        newDate = solver(day, month, year, yearChek);//просчитываем новую дату
        newDay = newDate[0];
        newMonth = newDate[1];
        newYear = newDate[2];

        boolean dataCheckNewDate = dataCheckReal(newDay, newMonth, newYear, yearChek);//выясняем реальная новая дата или нет

        if (dataCheckNewDate)
            print(newDay, newMonth, newYear);//если дата без ошибки - то выводим на печать
        else print("Error");
    }

    static void print(int day, int month, int year) {
        System.out.printf("%s.%s.%s", day, month, year);

    }

    static void print(String text) {
        System.out.println(text);

    }

    static int[] solver(int day, int month, int year, boolean yearChek) {
        int[] date = new int[3];


        switch (day) {

            case 28:
                if (month == 2 && yearChek)
                    day = day + 1;
                else if (month == 2 && !yearChek)
                    day = 1;
                else day = day + 1;

                break;
            case 29:
                if (month == 2 && yearChek) {
                    day = 1;
                    month = month + 1;
                } else if (month == 2 && !yearChek)
                    print("Где-то возникла ошибка");
                else day = day + 1;
                break;
            case 30:
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    day = 1;
                    month = month + 1;
                } else day = day + 1;
                break;
            case 31:
                if (month == 1 || month == 3 || month == 5 || month == 8 || month == 10) {
                    day = 1;
                    month = month + 1;
                } else if (month == 12) {
                    day = 1;
                    month = 1;
                    year = year + 1;
                }
                break;
            default:
                day = day + 1;
        }
        date[0] = day;
        date[1] = month;
        date[2] = year;

        return date;
    }


}