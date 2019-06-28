package Jd1june2019.Lection03;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        System.out.println("введите целое число");
        int num = input();
        boolean flagNum = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flagNum = false;
                System.out.printf("Введеное число %d не является простым, так как делится на %d", num, i);
                break;
            }

        }
        if (flagNum) {
            System.out.printf("Введеное число %d является простым", num);
        }
    }

    static int input() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

}
