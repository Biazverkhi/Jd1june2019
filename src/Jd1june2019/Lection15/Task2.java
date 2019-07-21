package Jd1june2019.Lection15;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args) throws IOException {
        File file = new File("C:" + File.separator + "Users" + File.separator + "L" + File.separator + "Downloads" + File.separator + "myfile.txt");
        FileReader read = new FileReader(file, Charset.forName("Cp1251"));//ура !!!!!!!
        char[] buffer = new char[(int) file.length()];
        read.read(buffer);
        String text = new String(buffer);
        text.trim();
        //  String array[]=text.split("\\s*(\\d*)(\\s|,|!|\\.)(\\d*)\\s*");
        String pattern = "\\b(?ui:[йцкнгшщзхъфвпрлджчсмтьб][а-я]*\\b\\.*\\s*)";
        Pattern pt = Pattern.compile(pattern);
        Matcher mch = pt.matcher(text);
        while (mch.find()) {
            System.out.print(mch.group() + " ");
        }
    }
}

