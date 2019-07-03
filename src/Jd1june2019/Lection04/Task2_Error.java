package Jd1june2019.Lection04;

public class Task2_Error {
    private Task2_Error() {
    }

    public static boolean moneyError(int money, int sumMoneyBankomat) {//первая проверка введенной суммы, для того чтобы не авыоплнять бесполезные расчеты.
        boolean flag = true;// флаг 0 если все хорошо
        if (money < 20 || money == 30 || money % 10 != 0) {//проверка. если ввели сумму меньше мин номинала, или которую нельзя выдать - возвращаем false
            flag = false; // флаг false если сумма меньше номинала или которую невозможно выдать из-за кратности.
            Task2_printOf.errorMoneyMinPrint();//Введена недопустимая сумма
        } else if (money > 800) {
            flag = false;//флаг false если сумма больше максимального лимита.
            Task2_printOf.errorMoneyMaxPrint();//Сумма превышает разовый лимит
        } else if (money > sumMoneyBankomat) {
            flag = false; // флаг falseесли сумма больше чем денег в банкомате.
            Task2_printOf.errorMoneyMoreBankomat();//В банкомате недостаточно средств
        }
        return flag;
    }

    public static boolean arrayError(int[][] nominalBanknot, int[][] moneyBankomat, int money) {
        //проверка1. Совпадает ли сумма массива  nominalBanknot с требуемой суммой на предмет ошибки расчетов.
        //проверка2. Достаточное ли количество требуемого номинала
        boolean arrayError = true;//флаг ошибки
        int sum = 0;//сумма денег из массива  nominalBanknot. Должна совпадать с money.
        for (int i = 0; i < nominalBanknot.length; i++) {
            if (moneyBankomat[i][0] < nominalBanknot[i][0]) {//проверка2.
                arrayError = false;
                Task2_printOf.errorNoNominal(moneyBankomat[i][1]);//при проверке сразу печатает каких номиналов не хватает.
            }
            sum += nominalBanknot[i][0] * nominalBanknot[i][1];//считаем сумму выдаваемых денег
        }
        if (sum != money || sum == 0) {//проверка1 на совпадение суммы
            arrayError = false;
            Task2_printOf.error();//"Ошибка выдачи средств" если произошла ошибка в расчетах
        }

        return arrayError;
    }

}
