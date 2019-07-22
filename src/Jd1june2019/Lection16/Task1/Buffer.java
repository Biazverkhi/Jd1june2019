package Jd1june2019.Lection16.Task1;

import java.io.*;

public class Buffer {
    File fileBuffer;

    public Buffer() {
        fileBuffer = new File("D:" + File.separator + "Buffer.txt");
    }

    public long BufferWrite(char[] buff) throws IOException {
        Long start = System.currentTimeMillis();
        BufferedWriter bWtriter = new BufferedWriter(new FileWriter(fileBuffer));
        bWtriter.write(buff);
        bWtriter.close();
        Long stop = System.currentTimeMillis();
        return stop - start;
    }


    public long BufferRead() throws IOException {
        Long start = System.currentTimeMillis();
        BufferedReader bReader = new BufferedReader(new FileReader(fileBuffer));
        char[] buffer = new char[(int) fileBuffer.length()];
        bReader.read();
        bReader.close();
        Long stop = System.currentTimeMillis();
        return stop - start;
    }


}
