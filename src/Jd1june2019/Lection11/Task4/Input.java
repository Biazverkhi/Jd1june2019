package Jd1june2019.Lection11.Task4;

import java.util.Scanner;

public abstract class Input {


    public static int inputNumber(){
        Scanner sc =new Scanner(System.in);
        System.out.println("добавьте число в Черный ящик");
       return  sc.nextInt();
    }
}
