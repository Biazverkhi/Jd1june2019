package Jd1june2019.Lection12;

public class Task1 {
    static String text = null;

    public static void main(String[] args) {

        try {
            text.toUpperCase();

        } catch (NullPointerException e) {
            System.out.println("Нельзя работать с null reference");
        }
    }
}
