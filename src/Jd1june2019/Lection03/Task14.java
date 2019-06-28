package Jd1june2019.Lection03;

public class Task14 extends Task13 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int num = input();
        int factorial = factorialFOR(num);
        System.out.println(factorial);
        int factorial2 = factorialWHILE(num);
        System.out.println(factorial);

    }

    static int factorialFOR(int num) {
        int factorial = 1;

        for (int i = 2; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    static int factorialWHILE(int num) {
        int factorial = 1;

while (num>0)   {
    factorial = factorial * num;
    num--;
        }
        return factorial;
    }
}
