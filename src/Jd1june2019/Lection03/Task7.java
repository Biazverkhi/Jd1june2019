package Jd1june2019.Lection03;

public class Task7 extends Task1 {

    public static void main(String[] args) {

        int[] array = new int[]{1, 0, 5, 1, 9, 0, 3, 4, 0, 5, 2, 9, 2, 3, 0, 5, 6, 8, 9};
        int min = 0;
        int max = 9;
        int posMin = 0;
        int sum = 0;
        int posMax = 0;
        for (int x = 0; x < array.length; x++) {
            if (array[x] == min) {
                posMin = x;//нахожу позицию минимального элемента
            }

            if (array[x] == max) {
                posMax = x;//нахожу позицию максимального элемента
                for (int y = posMin + 1; y < posMax; y++) {// как только нашли позиции мин и макс, суммируем промежуток
                    sum = sum + array[y];
                }
            }
        }
        printMassiv1(array);
        System.out.println(sum);
    }
}
