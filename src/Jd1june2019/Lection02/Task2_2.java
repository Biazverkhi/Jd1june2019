package Jd1june2019.Lection02;

import java.util.Scanner;

public class Task2_2 {


    public static void main(String[] args) {
        int money = inputInt();

        String rubl = " рублей";

        switch (money % 10) {

            case 1:
                if (money == 11)
                    break;
                rubl = " рубль";

                break;

            case 2:
            case 3:
            case 4:
                if (money == 12 || money == 13 || money == 14)
                    break;

                rubl = " рубля";
                break;
        }


        System.out.println(money + rubl);


    }


    static int inputInt() {
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();


        return money;
    }

}
