package Jd1june2019.Lection04;

public class Task2_getMoney {

    public static boolean getMoney(int money, Task2_Bankomat o) {//метод возвращает булево значение о выполнении операции снятия денег

        boolean flag = false;

        int moneyError = Task2_Error.moneyError(money, o.getSumMoneyBankomat());
        //проверка. если ввели сумму меньше мин номинала, или не кратную - возвращаем false
        if (moneyError == 0) {// если ошибки нет, продолжаем выполнение
            int[][] nominalBanknot = Task2_getArrayNominalAmount.getNominal(money, o);//массив[количество][номинал]
            // метод возвращает массив с количеством купюр по номиналу, которые надо выдать
            int arrayError = Task2_Error.arrayError(nominalBanknot, o.getMoneyBankomat(), money);
            //тут большая проверка:1.
            if (arrayError == 0)//если массив не пустой, и сумма не привышает запас банкомата печатаем и отнимаем от объекта
            {
                Task2_printOf.printResult(nominalBanknot, money);// печатаем результат по условию задачи
                flag = true;//возвращаем требуемый по условию задачи флаг
                o.delMoney(nominalBanknot);//вызов функции минуса суммы с банкомата
            } else if (arrayError % 2 == 1) // сумма массива  nominalBanknot не совпадает с требуемой суммой
            {
                Task2_printOf.error();//"Ошибка выдачи средств"если произошла ошибка в расчетах и вернулся пустой массив, с нулевым количеством номиналов
            } else if (arrayError > 1)//недостаточно купюр какого либо номинала
            {
                System.out.println("test");

            }
        } else if (moneyError == 1) {// если ввели сумму меньше мин номинала, или не кратную, вызов текста.
            Task2_printOf.errorMoneyMinPrint();//Введена недопустимая сумма
            //  Task2_printOf.printNominal(o.getMoneyBankomat());// выводим возможные номиналы

        } else if (moneyError == 2) {// если введена сумма больше разового лимита
            Task2_printOf.errorMoneyMaxPrint();//Сумма превышает разовый лимит

        } else if (moneyError == 3) {// если введена сумма больше чем денег в банкомате
            Task2_printOf.errorMoneyMoreBankomat(o.getSumMoneyBankomat());//В банкомате недостаточно средств

        }

        return flag;
    }

}
