package Jd1june2019.Lection15;

import java.io.File;

public class Task6 {
    public static int count = 0;

    public static void main(String[] args) {
        File dir = new File("C:" + File.separator + "Users" + File.separator + "Blue" + File.separator + "Downloads");
        print_Dir_File(dir);
    }

    public static void print_Dir_File(File dir) {
        File[] ret = dir.listFiles();
        String text = "  ";
        System.out.printf("%s[%s]\n", text, dir.getName());
        for (int i = 0; i < ret.length; i++) {
            if (ret[i].isFile()) {
                System.out.printf("\t%s%s\n", text, ret[i].getName());
            }
        }
        for (int j = 0; j < ret.length; j++) {
            if (ret[j].isDirectory()) {
                count++;
                print_Dir_File(ret[j]);
            }

        }


    }
}