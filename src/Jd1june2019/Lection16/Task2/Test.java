package Jd1june2019.Lection16.Task2;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Computer comp = new Computer();
        File file = new File("D:" + File.separator + "Computer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(comp);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Computer comp2 = (Computer) ois.readObject();
        System.out.println("frame  " + comp2.getFrame());
        System.out.println("name  " + comp2.getName());
        System.out.println("FreeSpace  " + comp2.getFreeSpace());
        System.out.println("numberkey  " + comp2.getNumberKey());
        System.out.println("versionchip  " + comp2.getVersionChip());
        ois.close();
    }
}
