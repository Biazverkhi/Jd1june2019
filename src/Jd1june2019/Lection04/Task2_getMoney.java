package Jd1june2019.Lection04;

public class Task2_getMoney {

    public static boolean getMoney(int money, Task2_Bankomat o) {//метод возвращает булево значение о выполнении операции снятия денег
        boolean flag = false;
        boolean moneyError = Task2_Error.moneyError(money, o.getSumMoneyBankomat());
        //проверка. если ввели сумму меньше мин номинала, или больше одноразового лимита или больше чем денег в банкомате - возвращаем false
        if (moneyError) {// если ошибки нет, продолжаем выполнение
            int[][] nominalBanknot = Task2_getArrayNominalAmount.getNominal(money, o.getBaseBankomat(), o.getMoneyBankomat());//массив[количество][номинал]
            // метод возвращает массив с количеством купюр по номиналу, которые надо выдать
            boolean arrayError = Task2_Error.arrayError(nominalBanknot, o.getMoneyBankomat(), money);
            //блок проверки ошибок.
            if (arrayError)//если ошибок нет, выдаем результат.
            {
                Task2_printOf.printResult(nominalBanknot, money);// печатаем результат по условию задачи
                flag = true;//возвращаем требуемый по условию задачи флаг
                o.delMoney(nominalBanknot);//вызов функции минуса суммы с банкомата
            }
        }//если ошибки есть, они полетят из блока Task2_Error, там же они попытаются решится.
        return flag;
    }
}
