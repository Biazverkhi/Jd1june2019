package Jd1june2019.Lection13;

public class Task11 {
    public static void main(String[] args) {
        String text = "Подсчитать !могут количество слов в тексте. " +
                "Учесть, что    слова    могут  ,  разделяться ttt   несколькими tt пробелами nhfnfnf.";
        char[] arr = text.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ',' || arr[i] == '.' || arr[i] == '!') {
                count++;
            }
        }

        System.out.println(count);
    }
}
