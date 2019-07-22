package Jd1june2019.Lection15;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Task6_1 {
    public static int positionDirectory(File dir) {
        int positionDerictory;

        Pattern pt = Pattern.compile("[\\\\]*");
        Matcher mch = pt.matcher(dir.getAbsolutePath());
        String root = "";
        while (mch.find()) {
            root += mch.group();
        }
        positionDerictory = root.length();

        return positionDerictory;
    }

    public static String tabulat(int positionRootDirectory, int positionDirektory) {

        int tab = positionDirektory - positionRootDirectory;

        String tabulat = "";
        for (int i = 0; i < tab; i++) {
            tabulat += "\t";
        }


        return tabulat;
    }


}
