package Jd1june2019.Lection04;

public class Task2_Test {
    public static void main(String[] args) {
        Task2_Bankomat bankomat = new Task2_Bankomat(20, 2, 50, 5, 100, 10);// ввод массива с данными в следующем порядке? начиная с меньшего номинала: номинал и количество, номинал и количество и т.д.
      //  Task2_Bankomat bankomat2 = new Task2_Bankomat();
//bankomat2.addMoney(9,6,8);
        int money=Task2_Input.inputMoney();
boolean flag=Task2_getMoney.getMoney(money, bankomat);
       // boolean flag=Task2_getMoney.getMoney(money, bankomat2);

        if(flag)
        {Task2_printOf.printFlagTrue();
        }
        else
        {Task2_printOf.printFlagFalse();}
    }
}
