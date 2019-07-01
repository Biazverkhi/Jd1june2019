package Jd1june2019.Lection04;

public class Task2_getMoney {

    public static boolean getMoney(int money, Task2_Bankomat o) {//метод возвращает булево значение о выполнении операции снятия денег

        boolean flag = false;
        int moneyError = Task2_Error.moneyError(money);//проверка. если ввели сумму меньше мин номинала, или не кратную - возвращаем false

        if (moneyError == 0) {// если ошибки нет, продолжаем выполнение

            int[][] nominalBanknot = Task2_getArrayNominalAmount.getNominal(money, o);//массив[количество][номинал]
            // метод возвращает массив с количеством купюр по номиналу, которые надо выдать
            boolean arrayEmpty = Task2_Error.arrayEmpty(nominalBanknot);//!!Тут надо проверить сумма рава моней или нет!!!проверяем, вернулся пустой массив или нет
            boolean arrayMoreBankomat = Task2_Error.arrayMoreBankomat(nominalBanknot, o.getMoneyBankomat());

            if (arrayEmpty)//если массив не пустой, и сумма не привышает запас банкомата печатаем и отнимаем от объекта
            {
                if (arrayMoreBankomat) {// и если в банкомате достаточно средсв
                    Task2_printOf.printResult(nominalBanknot, money);// печатаем результат по условию задачи
                    flag = true;//возвращаем требуемый по условию задачи флаг
                    o.delMoney(nominalBanknot);//вызов функции минуса суммы с банкомата
                } else {
                    Task2_printOf.errorMoneyMoreBankomat();//ошибка если в банкомате недостаточно денег
                }
            } else // если массив пустой
            {
                Task2_printOf.error();//"Ошибка выдачи средств"если произошла ошибка в расчетах и вернулся пустой массив, с нулевым количеством номиналов
            }
        } else if (moneyError == 1) {// если ввели сумму меньше мин номинала, или не кратную, вызов текста.
            Task2_printOf.errorMoneyMinPrint();//Введена недопустимая сумма
            Task2_printOf.printNominal(o.getMoneyBankomat());// выводим возможные номиналы

        } else if (moneyError == 2) {// если введена сумма больше разового лимита
            Task2_printOf.errorMoneyMaxPrint();//Сумма превышает разовый лимит

        }


        return flag;
    }

}
