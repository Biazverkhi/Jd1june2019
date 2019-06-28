package Jd1june2019.Lection13;

public class Task5 {
    public static void main(String[] args) {
        String text="Подсчитать количество слов в тексте. " +
                "Учесть, что    слова    могут  ,  разделяться   несколькими пробелами.";
String [] text2=text.split("\\s*(\\s|,|!|\\.)\\s*");
        System.out.println(text);
        System.out.println(text2.length);

    }
}
