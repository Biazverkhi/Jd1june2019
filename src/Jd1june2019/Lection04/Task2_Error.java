package Jd1june2019.Lection04;

public class Task2_Error {
    private Task2_Error() {
    }

    public static int moneyError(int money, int sumMoneyBankomat) {//первая проверка введенной суммы, для того чтобы не авыоплнять бесполезные расчеты.
        int flag = 0;// флаг 0 если все хорошо
        if (money < 20 || money == 30 || money % 10 != 0) {//проверка. если ввели сумму меньше мин номинала, или которую нельзя выдать - возвращаем false
            flag = 1;// флаг 1 если сумма меньше номинала или которую невозможно выдать из-за кратности.
        } else if (money > 800) {
            flag = 2;// если сумма больше максимального лимита.
        } else if (money > sumMoneyBankomat) {
            flag = 3;// если сумма больше чем денег в банкомате.
        }
        return flag;
    }


    public static int arrayError(int[][] nominalBanknot, int[][] moneyBankomat, int money) {
        //проверка1. Совпадает ли сумма массива  nominalBanknot с требуемой суммой на предмет ошибки расчетов.
        //проверка2. Достаточное ли количество требуемого номинала
        int arrayError = 0;// значение ошибки: 0 -все норм; 1- посчитанная сумма из массива  nominalBanknot не совпадает с требуемой money
        //20-не хватает 20;50-50;100 - 100;Все ошибки в одном месте:171.
        int sum = 0;//сумма денег из массива  nominalBanknot. Должна совпадать с money.

        for (int i = 0; i < nominalBanknot.length; i++) {
            if (moneyBankomat[i][0] < nominalBanknot[i][0]) {
                arrayError += moneyBankomat[i][1];
                Task2_printOf.errorNoNominal(moneyBankomat[i][1]);
            }
            sum += nominalBanknot[i][0] * nominalBanknot[i][1];//считаем сумму выдаваемых денег

        }
        if (sum != money) {
            arrayError += 1;
        }

        return arrayError;
    }

}
