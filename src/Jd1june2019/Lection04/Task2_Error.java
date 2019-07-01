package Jd1june2019.Lection04;

import Jd1june2019.Lection13.Task2;

public class Task2_Error {
    private Task2_Error() {
    }

    public static int moneyError(int money) {//первая проверка введенной суммы, для того чтобы не авыоплнять бесполезные расчеты.
        int flag = 0;// флаг 0 если все хорошо
        if (money < 20 || money == 30 || money % 10 != 0) {//проверка. если ввели сумму меньше мин номинала, или которую нельзя выдать - возвращаем false
            flag = 1;// флаг 1 если сумма меньше номинала или которую невозможно выдать из-за кратности.
        } else if (money > 800) {
            flag = 2;
        }// если сумма больше максимального лимита.
        return flag;
    }


    public static boolean arrayEmpty(int[][] nominalBanknot) {// проверка пустой массив или нет
        // это сомнительная проверка. Подумать над ней еще раз
        // вести проверку выдаваемой суммы с посчитанным тут!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        int sum = 0;
        boolean arrayEmty=true;
        for (int i = 0;i < nominalBanknot.length; i++)

        {
            sum += nominalBanknot[i][0] * nominalBanknot[i][1];//считаем сумму выдаваемых денег
        }
        if (sum==0)
        {arrayEmty=false;}
    return arrayEmty;}

    public static boolean arrayMoreBankomat(int [][] nominalBanknot, int [][]moneyBankomat){//проерка достаточно ли средств в банкомате
        //Доработать метод на проверку недостаточности отдельного номинала.
        boolean arrayMoreBankomat=true;
        int sumMoneyBankomat=0;
        int sumNominalBanknot=0;
        for (int i = 0;i < nominalBanknot.length; i++)

        {
           sumNominalBanknot+= nominalBanknot[i][0] * nominalBanknot[i][1];
            sumMoneyBankomat+= moneyBankomat[i][0] * moneyBankomat[i][1];

        }
        if (sumNominalBanknot>sumMoneyBankomat)
        {arrayMoreBankomat=false;}

        return arrayMoreBankomat;}


//    public static void errorArrayMoreBankomatPrint() {//вызов ошибки
//
//        Task2_printOf.errorMoneyMoreBankomat();
//
//    }


//    public static void errorPrint() {//вызов ошибки
//
//        Task2_printOf.error();
//
//    }

//    public static void errorMoneyPrint(int [][]array) {//вызов ошибки
//
//        Task2_printOf.errorMoneyPrint();
//        Task2_printOf.printNominal(array);
//
//    }

}
