package Jd1june2019.Lection15;

import java.io.*;
import java.nio.charset.Charset;

public class Task1 {

    public static void main(String[] args) throws IOException {
        File file =new File("C:"+File.separator+"Users"+File.separator+"L"+File.separator+"Downloads"+File.separator+"myfile.txt");

     FileReader read=new FileReader(file,);
     int ch=read.read();
     while ((ch=read.read())!=-1)
     {
         System.out.println((char)ch);
    }

}}
