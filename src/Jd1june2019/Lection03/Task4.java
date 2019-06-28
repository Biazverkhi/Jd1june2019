package Jd1june2019.Lection03;

public class Task4 extends Task1 {
    public static void main(String[] args) {
        int[][] massiv = new int[][]{{1, 4, 7, 10}, {2, 5, 8, 11, 13}, {3, 6, 9, 12}};
        int[] array = linearize(massiv);
        int[] array2 = linearize2(massiv);

        printMassivN(massiv);
        printMassiv1(array);
        printMassiv1(array2);

    }

    static int[] linearize(int[][] massiv) {
        int count = 0;
        for (int x = 0; x < massiv.length; x++) {//определяем количество элементов в массиве
            count = count + massiv[x].length;
        }
        int[] array = new int[count];//создаем массив необходимой длины
        int pos = 0;
        for (int x = 0; x < massiv.length; x++) {//собственно переписываем все элементы по порядку
            for (int y = 0; y < massiv[x].length; y++) {
                array[pos] = massiv[x][y];
                pos++;
            }
        }
        return array;
    }


    static int[] linearize2(int[][] massiv) {//в этом методе слияние выполняется по столбикам
        int count = 0;
        int strPos = 0;
        int maxStrValue = 0;
        for (int x = 0; x < massiv.length; x++) {//определяем количество элементов в массиве
            count = count + massiv[x].length;
            if (massiv[x].length > maxStrValue) {
                maxStrValue = massiv[x].length;//длинна самой длиноой строки в массиве
                strPos = x;//поз самой длиной строки
            }
        }
        int[] array = new int[count];
        int pos = 0;
        for (int x = 0; x < massiv[strPos].length; x++) {//тут осуществляется заполнение по столбикам С УЧЕТОМ НЕРАВНОМЕРНОСТИ ЗАПОЛНЕНИЯ МАССИВА111
            for (int y = 0; y < massiv.length; y++) {
                if (massiv[y].length <= x) {
                    continue;
                }
//                if (pos == array.length) {
//                    break;
//                }
                array[pos] = massiv[y][x];

                pos++;
            }
        }
        return array;
    }


    static void printMassivN(int[][] array) {//вывод много мерного массива

        for (int[] x : array) {
            for (int y : x) {

                System.out.print(y + ", ");
            }
            System.out.println();

        }

    }//вывод многомерных массивов.


}
