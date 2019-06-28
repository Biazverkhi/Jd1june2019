package Jd1june2019.Lection03;

public class Task3 extends Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 1, 4, 0, 3, 4, 3, 5, 2, 0};
        int[] array2 = new int[]{6, 7, 8, 9, 10, 0, 8, 9};
        int length = array.length + array2.length;
        int[] arraySum = new int[length];
        int arraypos = 0;
        int arraypos2 = 0;
        for (int x = 0; x < arraySum.length; x++) {
            if (arraypos < array.length & x % 2 == 0 || arraypos2 >= array2.length) {
                arraySum[x] = array[arraypos];
                arraypos++;
            } else if (arraypos2 < array2.length & x % 2 == 1 || arraypos >= array.length) {
                arraySum[x] = array2[arraypos2];
                arraypos2++;
            }


        }
        printMassiv1(array);
        printMassiv1(array2);
        printMassiv1(arraySum);


    }

}
