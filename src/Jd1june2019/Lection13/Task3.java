package Jd1june2019.Lection13;

public class Task3 {

    public static void main(String[] args) {
        String str = "Словом Написать функцию, принимающую 2 параметра: " +
                "строку и слово - и возвращающую true, если строка начинается " +
                "и заканчивается этим словом";
        String word = "словом";
        boolean flag = strStringWord(str, word);
        System.out.println(flag);


    }

    public static boolean strStringWord(String str, String word) {
        boolean flag = false;
        String newStr = str.toLowerCase();
        String[] array = newStr.split(" ");
        if (array[0].equals(word) && array[array.length - 1].equals(word))
            flag = true;
        return flag;
    }


}
