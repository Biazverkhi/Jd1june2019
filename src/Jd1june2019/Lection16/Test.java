package Jd1june2019.Lection16;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("D:" + File.separator + "MyNotebook.txt");
        Notebook book = new Notebook();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(book);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Notebook book2 = (Notebook) ois.readObject();
        ois.close();
        System.out.println("frame  " + book2.getFrame());
        System.out.println("name  " + book2.getName());
        System.out.println("FreeSpace  " + book2.getFreeSpace());
        System.out.println("numberkey  " + book2.getNumberKey());
        System.out.println("versionchip  " + book2.getVersionChip());
        System.out.println("touchpad  " + book2.getTouchpad());
        System.out.println("diagonal transient поле " + book2.getDiagonal());
        System.out.println("diagonal первоначального объекта  " + book.getDiagonal());


    }
}
