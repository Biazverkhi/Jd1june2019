package Jd1june2019.Lection13;

public class Task8 {
    public static void main(String[] args) {


        String text = "топот";
        boolean flag = true;
        System.out.println(flag);

        for (int i = 0; i < text.length() / 2; i++) {
            char t1 = text.charAt(i);
            char t2 = text.charAt(text.length() - 1 - i);

            if (t1 != t2) {
                flag = false;
                break;
            }


        }


    }


}
