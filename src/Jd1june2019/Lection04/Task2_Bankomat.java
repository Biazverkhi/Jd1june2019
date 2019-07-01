package Jd1june2019.Lection04;

import static java.lang.Math.abs;

public class Task2_Bankomat {//вопрос Юлию. Как правильно масштабировать приложение, например добавив еще пару номиналов?
    private int[][] moneyBankomat;//[количество купюр][номинал купюр]
    private int[][] baseBankomat; //массив который будет использоваться в рассчетах, для исключения ввода в остальном коде номинала банкнот.

    public Task2_Bankomat(int... arg) {////конструктор с задаваемым значением.
        // ввод массива с данными в следующем порядке: начиная с меньшего номинала: номинал и количество, номинал и количество и т.д.
        int h = 0;// при этом сам массив будет представлен в ввиде : нколичество-номинал.
        moneyBankomat = new int[arg.length / 2][2];
        baseBankomat = new int[arg.length / 2][2];

        for (int i = 0; i < arg.length / 2; i++) {// заполняем данными массивы, причем задаем данные в прямом порядке:
            // номинал и количество, а заносим в массив в следующем порядке: во 1 столбик номинал, в 0 количество.
            for (int j = 1; j >= 0; j--) {
                moneyBankomat[i][j] = abs(arg[h]);
                if (j == 1) {
                    baseBankomat[i][j] = abs(arg[h]);//в этом массиве заполняем только номиналы, так как количество будет рассчитано далее
                } else {
                    baseBankomat[i][j] = 0;
                }
                h++;
            }
        }
    }//конструктор с задаваемым значением

    public Task2_Bankomat() {//конструктор по умолчанию
        moneyBankomat = new int[][]{{abs(0), 20}, {abs(0), 50}, {abs(0), 100}};
        baseBankomat = new int[][]{{abs(0), 20}, {abs(0), 50}, {abs(0), 100}};
    }

    public void addMoney(int b20, int b50, int b100) {
        moneyBankomat[0][0] = abs(b20);
        moneyBankomat[1][0] = abs(b50);
        moneyBankomat[2][0] = abs(b100);
    }//функция добавления денег

    public void delMoney(int nominalBanknot[][]) {
        for (int i = 0; i < nominalBanknot.length; i++) {
            moneyBankomat[i][0] -= nominalBanknot[i][0];
        }

    }//минус денег при снятии

    public int[][] getBaseBankomat() {
        return baseBankomat;
    }//геттер

    public int[][] getMoneyBankomat() {
        return moneyBankomat;
    }//геттер

}
