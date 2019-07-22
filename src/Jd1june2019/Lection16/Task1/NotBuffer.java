package Jd1june2019.Lection16.Task1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotBuffer {
    File fileNotBuffer;

    public NotBuffer() {
        fileNotBuffer = new File("D:" + File.separator + "NotBuffer.txt");
    }

    public long notBufferWrite(char[] buff) throws IOException {
        Long start = System.currentTimeMillis();
        FileWriter writer = new FileWriter(fileNotBuffer);
        writer.write(buff);
        writer.close();
        Long stop = System.currentTimeMillis();
        return stop - start;
    }


    public long notBufferRead() throws IOException {
        Long start = System.currentTimeMillis();
        FileReader reader = new FileReader(fileNotBuffer);
        char[] buffer = new char[(int) fileNotBuffer.length()];
        reader.read();
        reader.close();
        Long stop = System.currentTimeMillis();
        return stop - start;
    }


}

