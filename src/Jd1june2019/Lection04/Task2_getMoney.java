package Jd1june2019.Lection04;

public class Task2_getMoney {
    public static boolean getMoney(int money, Task2_Bankomat o) {//метод возвращает булево значение о выполнении операции снятия денег
        boolean flag = false;
        boolean moneyError = Task2_Error.moneyError(money);//проверка. если ввели сумму меньше мин номинала, или которую нельзя выдать - возвращаем false
        if (moneyError) {
            int[][] nominalBanknot = Task2_getArrayNominalAmount.getNominal(money, o);//массив[количество][номинал]
            // метод возвращает массив с количеством купюр по номиналу, которые надо выдать
            boolean arrayEmpty = Task2_Error.arrayEmpty(nominalBanknot);//проверяем пустой массив или нет
            boolean arrayMoreBankomat = Task2_Error.arrayMoreBankomat(nominalBanknot, o.getMoneyBankomat());
            if (arrayEmpty)//если массив не пустой, и сумма не привышает запас банкомата печатаем и отнимаем от объекта
            {
                if (arrayMoreBankomat) {// и если в банкомате достаточно средсв
                    Task2_printOf.printResult(nominalBanknot, money);// печатаем результат по условию задачи
                    flag = true;//возвращаем требуемый по условию задачи флаг
                    o.delMoney(nominalBanknot);//вызов функции минуса суммы с банкомата
                }
                else {
                    Task2_Error.errorArrayMoreBankomatPrint();//ошибка если в банкомате недостаточно денег
                }
            } else // если массив пустой
            {
                Task2_Error.errorPrint();//если произошла ошибка в расчетах и вернулся пустой массив, с нулевым количеством номиналов
            }
        } else {
            Task2_Error.errorMoneyPrint();// если введена ошибочная сумма
        }


        return flag;
    }

}
