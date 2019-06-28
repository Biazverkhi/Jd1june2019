package Jd1june2019.Lection02;

import java.util.Scanner;

public class Task2_1 {

    public static void main(String[] args) {
        int money = inputInt();

        String rubl = " рублей";

        if (money % 10 == 1 && money != 11)
            rubl = " рубль";
        if ((money % 10 == 2 && money != 12 || money % 10 == 3 && money != 13 || money % 10 == 4 && money != 14))
            rubl = " рубля";

        System.out.println(money + rubl);


    }


    static int inputInt() {
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();


        return money;
    }


}
