package Jd1june2019.Lection17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String text = "Написать программу,апример <p id =\"p1\">  <\\p>\n" +
                "<p align=\"left\">Выравниваем абзац по левому краю.</p>\n" +
                "<p align=\"right\">Выравниваем абзац по правому краю.</p>\n" +
                "<p align=\"center\">Выравниваем абзац по центру.</p>\n" +
                "<p style=\"text-align-last: justify;\">Выравниваем абзац по ширине.</p>";
        Pattern pat = Pattern.compile("((?m)<[Pp][\\w\\s=\"-;]*>)");
        Matcher math = pat.matcher(text);
        System.out.println(math.replaceAll("<p>"));
    }
}
