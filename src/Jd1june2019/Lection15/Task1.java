package Jd1june2019.Lection15;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Task1 {

    public static void main(String[] args) throws IOException {
        File file =new File("C:"+File.separator+"Users"+File.separator+"L"+File.separator+"Downloads"+File.separator+"myfile.txt");
        //file.createNewFile();
        FileReader read = new FileReader(file, Charset.forName("Cp1251"));//ура !!!!!!!
        int ch;
//     while ((ch=read.read())!=-1)//как вариант
//     {
//         System.out.print((char)ch);
//    }
        char[] buffer = new char[(int) file.length()];
        while ((read.read(buffer)) != -1) {
            System.out.println(buffer);
        }

    }}