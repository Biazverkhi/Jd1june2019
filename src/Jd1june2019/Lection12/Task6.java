package Jd1june2019.Lection12;

import static java.lang.Math.random;

public class Task6 {
    public static void main(String[] args) {
        try {
            randomExteption();
        } catch (ArithmeticException e) {
            System.out.println("Поделили на ноль!!!");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("null reference");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вылезли за размер массива");
            e.printStackTrace();
        }
    }

    public static void randomExteption() {
        int i = (int) (random() * 3);
        if (i == 0) {
            int x = 5 / 0;
        } else if (i == 1) {
            String x = null;
            x.toUpperCase();
        } else if (i == 2) {
            int[] array = new int[2];
            for (int j = 0; j <= array.length; j++) {
                int x = array[j];
            }
        }
    }
}
