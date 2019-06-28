package Jd1june2019.Lection03;

import java.util.Scanner;

public class Task9 extends Task4 {

    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        String[][] array = new String[a][a];


        for (int x = 0; x < array.length; x++) {//алгоритм заполнения звездочкой
            for (int y = x; y < array.length - x; y++) {
                array[x][y] = "*";

                array[array.length - 1 - x][y] = "*";
            }
        }
        for (int x = 0; x < array.length - 1; x++) {//алгоритм заполнения пробелом
            for (int y = x + 1; y < array.length - 1 - x; y++) {
                array[y][x] = " ";

                array[y][array.length - 1 - x] = " ";
            }
        }
        printMassivN(array);
    }
    static void printMassivN(String[][] array) {
        for (String[] x : array) {
            for (String y : x) {

                System.out.print(y);
            }
            System.out.println();

        }

    }


}
