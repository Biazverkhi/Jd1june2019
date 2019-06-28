package Jd1june2019.Lection13;

import java.util.Formatter;

public class Task7 {
    public static void main(String[] args) {
        long a = 333L;

        long starTime = System.nanoTime();
        String text = getString(a);
        long stopTime = System.nanoTime();
        long endTime = stopTime - starTime;
        System.out.println(text);
        System.out.println(endTime);

        long starTime2 = System.nanoTime();
        String text2 = getString2(a);
        long stopTime2 = System.nanoTime();
        long endTime2 = stopTime2 - starTime2;
        System.out.println(text2);
        System.out.println(endTime2);


        long starTime3 = System.nanoTime();
        String text3 = getString3(a);
        long stopTime3 = System.nanoTime();
        long endTime3 = stopTime3 - starTime3;
        System.out.println(text3);
        System.out.println(endTime3);

        long starTime4 = System.nanoTime();
        String text4 = getString4(a);
        long stopTime4 = System.nanoTime();
        long endTime4 = stopTime4 - starTime3;
        System.out.println(text4);
        System.out.println(endTime4);

    }

    public static String getString(long a) {

        String text = String.valueOf(a);
        String text2 = "";
        int count = 10 - text.length() - 1;

        if (text.length() > 10) {
            text = "0000000000";
        } else {
            for (int i = 0; i <= count; i++) {
                text2 = text2 + 0;
            }
            text = text2 + text;
        }
        return text;
    }

    private static String getString2(long a) {
        StringBuilder text = new StringBuilder(String.valueOf(a));
        int count = 10 - text.length() - 1;

        if (text.length() > 10) {
            text.replace(0, 9, "0");
            text.delete(10, text.length());
        } else {
            for (int i = 0; i <= count; i++) {
                text.insert(0, 0);
            }
        }

        String text2 = String.valueOf(text);
        return text2;
    }

    public static String getString3(long a) {

        //StringBuffer text = new StringBuffer("0000000000");
        String text2 = String.valueOf(a);

        if (text2.length() > 10) {
            text2 = "0000000000";
        } else {
            Formatter form = new Formatter();
            text2 = String.valueOf(form.format("%010d", a));
        }

        return text2;
    }

    public static String getString4(long a) {
        String text = "";
        if (a / 9999999999l > 0) {
            text = "0000000000";
        } else {
            long e = 10000000000l + a;
            String re = String.valueOf(e);
            text = re.substring(1, re.length() - 1);
        }

        return text;
    }
}
