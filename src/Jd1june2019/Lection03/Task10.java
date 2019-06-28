package Jd1june2019.Lection03;

public class Task10 extends Task4 {
    public static void main(String[] args) {
        int[][] massiv1 = new int[][]{{1, 4, 7, 10}, {2, 5, 8, 11, 13}, {3, 6, 9, 12}};
        int[][] massiv2 = new int[][]{{1, 3, 4, 8}, {2, 5, 8, 11, 13}, {9, 0, 3, 11}};
        int[][] flagMassiv = equalsAray(massiv1, massiv2);
        printMassivN(massiv1);
        printMassivN(massiv2);
        printMassivN(flagMassiv);
    }

    static int[][] equalsAray(int[][] array, int array2[][]) {
        int[][] flagMassiv = new int[array.length][];
int count=0;
        for (int x = 0; x < array.length; x++) {
            flagMassiv[x]=new int [array[x].length];

            for (int y = 0; y < array[x].length; y++) {

                if (array[x][y] == array2[x][y])
                    {
                        flagMassiv[x][y] = 1;
                        count++;

                    }
                  else {flagMassiv[x][y] = 0;}

            }
        }
        System.out.println("Всего выявлено :"+count+ " совпадений");

        return flagMassiv;
    }

    static void printMassivN(int[][] array) {//вывод много мерного массива

        for (int[] x : array) {
            for (int y : x) {

                System.out.printf( "%2d, ", y);
            }
           // System.out.println();

        }
        System.out.println();

    }//вывод многомерных массивов.



}