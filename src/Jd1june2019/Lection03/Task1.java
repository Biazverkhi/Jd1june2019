package Jd1june2019.Lection03;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5};
        int[] array2 = new int[array.length];


        for (int y = 1; y < array2.length; y++) {


            array2[y] = array[y - 1];


            if (y == array.length - 1) {
                array2[0] = array[y];
            }
        }
        System.out.println("первоначальный массив:");
printMassiv1(array);
        System.out.println("Измененный массив:");
printMassiv1(array2);



    }


    static void printMassiv1(int[]array){

        for (int x:array
             ) {
            System.out.print(x+", ");

        }
        System.out.println();




    }


}
