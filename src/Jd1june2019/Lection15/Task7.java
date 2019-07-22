package Jd1june2019.Lection15;
import static Jd1june2019.Lection15.Task7_1.revers;

import java.io.*;

public class Task7 {
    public static void main(String[] args) {//я знаю что так нельзяделать, опаздываю сильно.
        File file=new File("C:"+File.separator+"Task5.java");
        FileReader reader=null;
        File newFile=new File("C:"+File.separator+"NewTask5.txt");
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        char[] buffer=new char[(int)file.length()];
        try {
            reader.read(buffer);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String [] revers=revers(buffer);
                try {
            newFile.createNewFile();
            FileWriter writer  = new FileWriter(newFile);
          if (newFile.isFile()&&newFile.exists())
          {
              for (int i=revers.length-1;i>=0;i--)
              {writer.write(revers[i]);}

              writer.close();
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
