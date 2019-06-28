package Jd1june2019.Lection02;

import java.util.Scanner;

public class Task7 {


    public static void main(String[] args) {
int [] value = inputValue();
int a=value[0];
int b=value[1];
int c=value[2];
int d=discriminant(a,b,c);
boolean dZero=isZero(d);
boolean dPositive=isPositive(d);
if (dPositive)
{double x1=(-b-Math.sqrt(d))/(2*a);
double x2=(-b+Math.sqrt(d))/(2*a) ;
    System.out.printf("x1=%.3f; x2=%.3f", x1, x2);}
else if (dZero) {
    double x1 = (-b ) / (2 * a);
    System.out.printf("x1=%.3f", x1);}
    else System.out.printf("Уравение корней не имеет по причине отрицательного дискриминанта: D=%d", d);

    }





    static boolean isPositive(int dec) {
        boolean positiveFlag = false;
        if (dec > 0)
            positiveFlag = true;
        return positiveFlag;
    }
    static boolean isZero(int dec) {
        boolean zeroFlag = false;
        if (dec == 0)
            zeroFlag = true;
        return zeroFlag;
    }
    static int discriminant(int a, int b, int c) {
        int discriminant;
        discriminant = b *b - 4 * a * c;
        return discriminant;
    }
    static int inputFromKeyB() {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        return x;
    }
    static int [] inputValue(){
        int [] value =new int[3];
        System.out.println("введите параметры квадратного уравнения:");
        boolean zero = true;
        do {
            System.out.println("a=");
            value[0] = inputFromKeyB();
            if (zero = isZero(value[0])) {
                zero = true;
                System.out.println("a не должно равняться 0, введите а еще раз");
            } else
                System.out.println("a= " + value[0]);
        }
        while (zero);
        System.out.println("b=");
        value[1] = inputFromKeyB();
        System.out.println("b= " + value[1]);
        System.out.println("c=");
        value[2]= inputFromKeyB();
        System.out.println("c= " + value[2]);

    return value;}



    }