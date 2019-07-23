package Jd1june2019.Lection14;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        while (true)//для удобства теста
        {
            Scanner cs = new Scanner(System.in);
            String text = cs.nextLine();
            boolean mail = text.matches("\\b[a-zA-Z][\\w]*@[\\w]*\\.(com|org)\\b");
            System.out.println(mail);
        }
    }


}
