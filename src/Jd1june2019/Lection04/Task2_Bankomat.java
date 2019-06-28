package Jd1june2019.Lection04;

public class Task2_Bankomat {//вопрос Юлию. Как правильно масштабировать приложение, например добавив еще пару номиналов?
    private int[][] moneyBankomat;//[количество купюр][номинал купюр]
    private int[][] baseBankomat; //массив который будет использоваться в рассчетах, для исключения ввода в остальном коде номинала банкнот.

    public Task2_Bankomat(int... arg) {// ввод массива с данными в следующем порядке? начиная с меньшего номинала: номинал и количество, номинал и количество и т.д.
        int h = 0;// при этом сам массив будет представлен в ввиде : нколичество-номинал.
        moneyBankomat = new int[arg.length / 2][2];
        baseBankomat = new int[arg.length / 2][2];

        for (int i = 0; i < arg.length / 2; i++) {// заполняем данными массивы
            for (int j = 1; j >= 0; j--) {
                moneyBankomat[i][j] = arg[h];
                if (j == 1) {
                    baseBankomat[i][j] = arg[h];
                } else {
                    baseBankomat[i][j] = 0;
                }
                h++;

            }
        }


    }//конструктор с задаваемым значением

    public Task2_Bankomat() {
        moneyBankomat = new int[][]{{0, 20}, {0, 50}, {0, 100}};
        baseBankomat = new int[][]{{0, 20}, {0, 50}, {0, 100}};

    }//конструктор по умолчанию

    public void addMoney(int b20, int b50, int b100) {
        moneyBankomat[0][0] = b20;
        moneyBankomat[1][0] = b50;
        moneyBankomat[2][0] = b100;
    }//функция добавления денег

    public void delMoney(int nominalBanknot[][]) {
        for (int i = 0; i < nominalBanknot.length; i++) {
            moneyBankomat[i][0] = nominalBanknot[i][0];
        }

    }//минус денег при снятии

    public int[][] getBaseBankomat() {
        return baseBankomat;
    }

    public int[][] getMoneyBankomat() {
        return moneyBankomat;
    }

}
