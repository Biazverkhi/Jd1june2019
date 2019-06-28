package Jd1june2019.Lection03;

public class Task2_1 extends Task1 {
    public static void main(String[] args) {

        int[] array = new int[]{1, 3, 5, 1, 8, 0, 3, 4, 3, 5, 2, 1};
        printMassiv1(array);
        for (int x = 0; x < array.length - 1; x++) {
            int count = 0;
            for (int y = x + 1; y < array.length; y++) {//определяем количество совпадений в строке на основании одного члена
                if (array[x] == array[y])
                    count++;
            }
            int[] array2 = new int[array.length - count];//создаем новый массив , равный числу без совпадений
            for (int q=0;q<=x;q++)//переписываем ранее сравненные члены
            {array2[q] = array[q];}
            int pos=x+1;
            for (int z = x + 1; z < array.length; z++) {//
                if (array[x] != array[z]) {
                    array2[pos] = array[z];
                    pos++;
                }
            }
            array = array2;
        }
        printMassiv1(array);
    }
}
