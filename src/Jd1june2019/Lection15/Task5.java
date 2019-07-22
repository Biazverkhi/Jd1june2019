package Jd1june2019.Lection15;

import java.io.*;

import static java.lang.Math.random;

public class Task5 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:" + File.separator + "Users" + File.separator + "L" + File.separator + "Downloads" + File.separator + "MyFile.txt");
        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(file));
        for (int i = 0; i < 20; i++) {
            int num = ((int) (random() * 255 + 255));
            System.out.printf("%3d ", num);
            try {
                outputStream.writeInt(num);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        DataInputStream inputStream = new DataInputStream(new FileInputStream(file));
        System.out.println();
        int num;
        int sum = 0;
        for (int t = 0; t < 20; t++) {
            try {
                num = inputStream.readInt();
                sum += num;
                System.out.printf("%3d ", num);
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.println("\n" + sum / 20);
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
