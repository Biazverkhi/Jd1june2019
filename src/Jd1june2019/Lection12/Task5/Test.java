package Jd1june2019.Lection12.Task5;

public class Test {


    public static void main(String[] args) {
        try {
            divNull();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getHiddenException());

        }

    }

    public static void divNull() throws MyException {
        int i = 0;
        int j = 10;
        try {
            int x = j / i;
        } catch (Exception e)//сначала подумал, что надо указать ArithmeticException:
        // а потом попробовал указать просто Exteption.
        // А в причину занесло все равно деление на ноль. Класс. Можно узнать что именно произошло
        {
            MyException exc = new MyException("Деление на ноль", e);
            throw exc;


        }

    }


}
