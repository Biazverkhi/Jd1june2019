package Jd1june2019.Lection04;

public class Task2_Test {
    public static void main(String[] args) {
        Task2_Bankomat bankomat = new Task2_Bankomat(20, 5, 50, 2, 100, 2);// ввод массива банка банкомата с данными в следующем порядке: начиная с меньшего номинала: номинал и количество, номинал и количество и т.д.
        //  Task2_Bankomat bankomat2 = new Task2_Bankomat();// или вызываем конструктор и
//bankomat2.addMoney(9,6,8);//заполняем банкомат сами
        boolean newInput = true;
        do {
            newInput = Task2_printOf.printNominal(bankomat.getMoneyBankomat(), bankomat.getSumMoneyBankomat());//сообщаем, какие номиналы есть в наличии
            int money = Task2_Input.inputMoney();//вводим требемое количество денег
            boolean flag = Task2_getMoney.getMoney(money, bankomat);//основной метод, где происходят все рсчеты и возврат флага по условию задачи
            // boolean flag=Task2_getMoney.getMoney(money, bankomat2);
            if (flag) {
                Task2_printOf.printFlagTrue();
            } else {
                Task2_printOf.printFlagFalse();
            }
            Task2_printOf.printNewInput();//зацикленность, продолжить выполнение операции?
            String inputYesNo = Task2_Input.inputYesNo();
            if (inputYesNo.equalsIgnoreCase("нет") || inputYesNo.equalsIgnoreCase("no") || inputYesNo.equalsIgnoreCase("ytn")) {
                newInput = false;
            }
        } while (newInput);

    }
}
