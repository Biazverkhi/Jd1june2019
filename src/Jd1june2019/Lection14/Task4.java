package Jd1june2019.Lection14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String text = "+375445752652, iii +375291534144, +375291534142, hhh +375332595645, kkk +375253265983, rrrr";
        Pattern patten = Pattern.compile("((\\+375)(29|44|25|33)(\\d{3})(\\d{2})(\\d{2}))");
        Matcher matcher = patten.matcher(text);
        StringBuffer buff = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(buff, matcher.group(2) + "(" + matcher.group(3) + ")" + matcher.group(4) + "-" + matcher.group(5) + "-" + matcher.group(6));
        }
        matcher.appendTail(buff);
        System.out.println(buff);
        //2 вариант решения: (но он с 9 Java, поэтому я решил сделать то что выше^)
        System.out.println(matcher.replaceAll(matchResult -> matcher.group(2) + "(" + matcher.group(3) + ")" + matcher.group(4) + "-" + matcher.group(5) + "-" + matcher.group(6)));
    }
}
