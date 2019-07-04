package Jd1june2019.Lection13;

public class Task10 {
    public static void main(String[] args) {
        String text = "Подсчитать могут количество слов в тексте. " +
                "Учесть, что    слова    могут  ,  разделяться   несколькими пробелами.";
        String text1 = "Подсчитать количество могут слов в тексте. " +
                "Учесть, что    слова    могут  ,  разделяться   несколькими пробелами.";

        String[] arr = text.split("\\s*(|,|!|\\.)\\s*");
        String[] arr1 = text.split("\\s*(\\s|,|!|\\.)\\s*");

        System.out.println(text);
        System.out.println(text1);


    }
}
