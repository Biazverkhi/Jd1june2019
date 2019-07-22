package Jd1june2019.Lection16.Task1;

import java.io.File;
import java.io.IOException;

import static java.lang.Math.random;

public class Task1 {
    public static void main(String[] args) throws IOException {//для упрощения чтения кода.
        File fileBuffer = new File("D:" + File.separator + "Buffer.txt");
        char[] buff = new char[5000000];
        for (int i = 0; i < buff.length; i++) {
            buff[i] = (char) ((int) (random() * 127));
        }
        NotBuffer notBuffer = new NotBuffer();
        Buffer Buffer = new Buffer();
        long notbufferwrite = notBuffer.notBufferWrite(buff);
        long notbufferread = notBuffer.notBufferRead();

        long bufferwrite = Buffer.BufferWrite(buff);
        long bufferread = Buffer.BufferRead();

        System.out.println("Запись с буфером:" + bufferwrite +
                "\nЗапись без буфера:" + notbufferwrite);
        System.out.println("Чтение с буфером:" + bufferread +
                "\nЧтение без буфера:" + notbufferread);


    }

}