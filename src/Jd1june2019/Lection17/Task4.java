package Jd1june2019.Lection17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Pattern patten = Pattern.compile("((\\+375)(29|44|25|33)(\\d{3})(\\d{2})(\\d{2}))");
        Matcher matcher = patten.matcher("+375445752652,+375291534144,+375291534142,+375332595645,+375253265983");
        System.out.println(matcher.replaceAll(matchResult -> matcher.group(2) + "(" + matcher.group(3) + ")" + matcher.group(4) + "-" + matcher.group(5) + "-" + matcher.group(6)));
    }//просто вывожу для наглядности.
}
