package Jd1june2019.Lection13;

public class Task12 {
    public static void main(String[] args) {
        String text = "Подсчитать !могут количество слов в тексте. Учесть, что    слова    могут  ,  разделяться ttt   несколькими tt пробелами nhfnfnf. ";
        int n = 5;
        String[] arr = new String[text.length() / n];
        int index = 0;
        for (int i = 0; i < text.length() - 4; i++) {
            arr[i] = text.substring(index, index + n);
            System.out.println(arr[i]);
            index += n;
            if (index == text.length()) {
                break;
            }
        }

    }


}
