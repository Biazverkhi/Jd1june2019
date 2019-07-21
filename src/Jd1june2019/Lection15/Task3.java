package Jd1june2019.Lection15;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {


    public static void main(String[] args) throws IOException {
        File file = new File("C:" + File.separator + "Users" + File.separator + "L" + File.separator + "Downloads" + File.separator + "myfile.txt");
        FileReader read = new FileReader(file, Charset.forName("Cp1251"));//ура !!!!!!!
        char[] buffer = new char[(int) file.length()];
        read.read(buffer);
        String text = new String(buffer).toLowerCase();
        String regex = "([^а-я]+)";
        String[] array = text.split(regex);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].length() == 0) {
                continue;
            }
            if (array[i].charAt(array[i].length() - 1) == array[i + 1].charAt(0)) {


                System.out.println(array[i] + " " + array[i + 1]);
            }


        }


    }

}
