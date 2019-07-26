package Jd1june2019.Lection14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {

        String text = "192.168.1.1\n" +
                "001.0.0.0 \n" +
                "256.1.1.0 \n" +
                "1.1.1.1. \n" +
                " kjkj-1.0.1.1\n" +
                "\n" +
                "0.0.0.0\n" +
                "0.249.1.0\n" +
                "255.0.0.1\n" +
                "255.55.255.255";
        Pattern pat = Pattern.compile("(?m)^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$");
        //(?m)^((25[0-5]|2[0-4]\d|1\d{2}|[1-9]?\d)(\.(?!$)|$)){4}$//компакт вариант. Подсказали в группе
        Matcher math = pat.matcher(text);
        while (math.find()) {
            System.out.println(math.group() + " Этой реальный IP");
        }
    }
}
