package Jd1june2019.Lection15;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static Jd1june2019.Lection15.Task6_1.*;

public class Task6 {
    static  int positionRootDirectory;
    public static void main(String[] args) {
        File dir = new File("C:" + File.separator + "Users" + File.separator + "L" + File.separator + "Downloads");
          positionRootDirectory= positionDirectory(dir);
              print_Dir_File(dir);
    }

    public static void print_Dir_File(File dir) {
        File[] ret = dir.listFiles();
        String tabulat=tabulat(positionRootDirectory, positionDirectory(dir));//расчет табуляции для для Tree видного вывода
        System.out.printf("|"+tabulat+"[%s]\n", dir.getName());
        int t=5;
        for (int i = 0; i < ret.length; i++) {
            if (ret[i].isFile()) {
                System.out.printf("|"+tabulat+"\t |%s\n" ,ret[i].getName());
            }
        }
        for (int j = 0; j < ret.length; j++) {
            if (ret[j].isDirectory()) {
                print_Dir_File(ret[j]);
            }

        }


    }
}