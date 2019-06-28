package Jd1june2019.Lection04;

public class Task2_Error {
    public static boolean moneyError(int money) {
        boolean flag = true;
        if (money < 20 || money == 30 || money % 10 != 0) {//проверка. если ввели сумму меньше мин номинала, или которую нельзя выдать - возвращаем false
            flag = false;
        }
        return flag;
    }


    public static boolean arrayEmpty(int[][] nominalBanknot) {// проверка пустой массив или нет
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


    public static void errorArrayMoreBankomatPrint() {//вызов ошибки

        Task2_printOf.errorMoneyMoreBankomat();

    }



    public static void errorPrint() {//вызов ошибки

        Task2_printOf.error();

    }

    public static void errorMoneyPrint() {//вызов ошибки

        Task2_printOf.errorMoneyPrint();

    }

}
