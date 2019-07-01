package Jd1june2019.Lection04;

public class Task2_printOf {
    private Task2_printOf() {
    }

    public static void printResult(int[][] array, int sum) {
        System.out.printf("Выдается сумма %d следующим номиналом: ", sum);
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][0]==0)
            {continue;}
            else {
                if (count!=0)
                {
                    System.out.print(", ");
                }
                System.out.print(array[i][0]+"*"+array[i][1]);
                count++;

            }
        }
        System.out.println(".");
    }
public static void printFlagTrue(){
    System.out.println("Операция завершена успешно");
}


    public static void printFlagFalse(){
        System.out.println("Операция не завершена");
    }

    public static void printNewInput() {
        System.out.println("Продолжить выполнение операций? (Да/Нет)\nВведите Да или Нет");

    }
    public static void error(){


        System.out.println("Ошибка выдачи средств");
    }

    public static void errorMoneyMinPrint() {


        System.out.println("Введена недопустимая сумма");
    }

    public static void errorMoneyMaxPrint() {


        System.out.println("Сумма превышает разовый лимит");
    }


    public static void inputMoney(){


        System.out.println("Введите требуемую сумму");
    }

    public static void errorMoneyMoreBankomat(){


        System.out.println("Введенная сумма превышает лимит банкомата");
    }

    public static void printNominal(int[][] array) {//печатает, какие номиналы в наличии.
        System.out.println("К выдаче возможны следующие номиналы:");

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == 0) {
                continue;
            } else {
                if (count != 0) {
                    System.out.print(", ");
                }
                System.out.print(array[i][1]);
                count++;

            }
        }
        System.out.println(".");


    }


}
