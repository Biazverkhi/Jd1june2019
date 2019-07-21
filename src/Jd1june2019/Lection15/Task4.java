package Jd1june2019.Lection15;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Task4 {
    public static void main(String[] args) throws IOException {


        File file = new File("C:" + File.separator + "Users" + File.separator + "L" + File.separator + "Downloads" + File.separator + "myfile.txt");
        FileReader read = new FileReader(file, Charset.forName("Cp1251"));//ура !!!!!!!
        char[] buffer = new char[(int) file.length()];
        read.read(buffer);
        String text = new String(buffer);
        String regex = "(\\n)";
        String[] array = text.split(regex);

        String[][] array2 = new String[array.length][];
        for (int i = 0; i < array.length; i++) {
            String num = "";

            array2[i] = array[i].split("\\D+");
            for (int j = 0; j < array2[i].length; j++) {
                if (num.length() > array2[i][j].length()) {
                } else {
                    num = array2[i][j];
                }

            }
            System.out.println(num.length());
        }
    }
}
