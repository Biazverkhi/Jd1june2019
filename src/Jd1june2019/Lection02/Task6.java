package Jd1june2019.Lection02;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        print("Введите ширину и длину участка");
        int[] area = new int[2];
        area = input();
        print("Введите ширину и длину первого дома");
        int[] houm1 = new int[2];
        houm1 = input();
        print("Введите ширину и длину второго дома");
        int[] houm2 = new int[2];
        houm2 = input();
        boolean flag = false;
        int count = 0;
        for (int x = 0; x < houm1.length; x++) {
            for (int y = 0; y < houm2.length; y++) {
                for (int z = 0; z < area.length; z++) {
                    if ((houm1[x] + houm2[y] <= area[z]) && (houm1[houm1.length - 1 - x] <= area[area.length - 1 - z] && houm2[houm2.length - 1 - y] <= area[area.length - 1 - z])) {
                        flag = true;
                        count++;
                    }

                }
            }
        }
        if (flag)
            System.out.printf("Дома с размерами %dx%d и %dx%d размещаются на участке %dx%d: в %d различных вариантах", houm1[0], houm1[1], houm2[0], houm2[1], area[0], area[1], count);
        else


            System.out.printf("Дома с размерами %dx%d и %dx%d нельзя разместить на участке %dx%d", houm1[0], houm1[1], houm2[0], houm2[1], area[0], area[1]);
    }

    static int[] input() {
        int[] massiv = new int[2];
        Scanner input = new Scanner(System.in);
        for (int x = 0; x < 2; x++) {
            massiv[x] = input.nextInt();
        }
        return massiv;
    }

    static void print(String text) {
        System.out.println(text);
    }
    }