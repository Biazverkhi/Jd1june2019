package Jd1june2019.Lection13;

public class Task10 {
    public static void main(String[] args) {
        String text = "Подсчитать могут количество слов в тексте. " +
                "Учесть, что    слова    могут  ,  разделяться   несколькими пробелами.";
        String text1 = "Подсчитать количество могут слов в тексте. " +
                " что    слова Учесть,   могут  ,  разделяться   несколькими пробелами.";

        String[] arr = text.split("\\s*(\\s|,|!|\\.)\\s*");
        String[] arr1 = text.split("\\s*(\\s|,|!|\\.)\\s*");
        int[] arrayFlag = new int[arr.length];
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i].equalsIgnoreCase(arr1[j])) {
                    if (arrayFlag[j] == 1) {
                        continue;
                    } else {
                        arrayFlag[j] = 1;
                        break;
                    }
                }
            }
        }



        System.out.println(text);
        System.out.println(text1);


    }
}
