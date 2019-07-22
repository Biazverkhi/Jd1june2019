package Jd1june2019.Lection15;

public class Task7_1 {
    public static String[] revers(char[] buffer) {
        String text = String.valueOf(buffer);
        StringBuffer buff = new StringBuffer(text);
        String[] revers = buff.reverse().toString().split("\r");

        return revers;
    }

}
