package Jd1june2019.Lection17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String text = "fdhgdfjgkjhg0x566564fffdsafsf 0X2356def";
        Pattern pat = Pattern.compile("(0[Xx][0-9a-fA-F]{1,8})");
        Matcher math = pat.matcher(text);
        while (math.find()) {
            System.out.println(math.group());

        }
    }
}
