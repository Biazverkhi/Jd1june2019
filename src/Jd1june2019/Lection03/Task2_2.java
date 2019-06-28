package Jd1june2019.Lection03;

public class Task2_2 extends Task1 {
    public static void main(String[] args) {

        int[] array = new int[]{1, 3, 5, 1, 8, 0, 3, 4, 3, 5, 2, 1};
        int[] arrayFlag = new int[array.length];//ввожу флаговый массив
        printMassiv1(array);
        int count = 0;
        for (int x = 0; x < array.length - 1; x++) {//выясняем де повторения и на месте повторения во флаговом массиве ставим единицу
            for (int y = x; y < array.length; y++) {
                if (y == x) continue;
                if (array[x] == array[y] && arrayFlag[y] == 0) {
                    arrayFlag[y] = 1;
                    count++;
                }
            }
        }
        int[] array2 = new int[array.length - count];//создаем новый массив с числом позиций без повторений
        int pos = 0;
        for (int x = 0; x < array.length - 1; x++) {//Если число из старого массива совпадает с 1 изфлагового, т о это повторение, и оно не пишется в новый массив.
            if (arrayFlag[x] == 0) {
                array2[pos] = array[x];
                pos++;
            }
        }
        printMassiv1(arrayFlag);
        printMassiv1(array2);
        System.out.println("Всего удалено повторений: " + count);
    }
}
