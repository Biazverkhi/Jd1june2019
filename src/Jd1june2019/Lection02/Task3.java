package Jd1june2019.Lection02;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int year = input();
        boolean yearVisokos;
        yearVisokos = yearCheckVisokos(year);
        if (yearVisokos)
            System.out.println(year + " год был високосным");
        else System.out.println(year + " год високосным не был");
    }
// метод возвращает введенное значение
    static int input() {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        return year;
    }
// метод определяет високосный год или нет, в него надо передать полученный год, метод возвращает true если год високосный и false если нет.
    static boolean yearCheckVisokos(int god) {
        boolean check = false;
        if (god % 4 == 0) {
            if (god % 100 == 0) {
                if (god % 400 == 0)
                    check = true;// год високосный
                else ;// check=false не високосный
            } else check = true;// год високосный
        } else ;//check false; не високосный
        return check;
    }


}
