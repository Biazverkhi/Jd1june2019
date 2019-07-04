package Jd1june2019.Lection04;

public class Task2_getArrayNominalAmount {
    public static int[][] getNominal(int moneyBase, int[][] baseBankomat, int[][] moneyBankomat) {//функция возвращает массив с количеством купюр по номиналу, которые надо выдать
        int[][] array = baseBankomat;// массив[количество][номинал]/ получили базовый массив с введенным при создании объектом номиналами но без количества.
        boolean flag = true;// флаг для цикла.
        int money = moneyBase;//glvtyz. переменную, для контроля в расчетах.
        // int money = money;// вспомогательная переменная с которой выполняем все операции. Передаваемая money остается не изменной для дальнейшей проверки
        while (flag) {
//расчет количества номиналов из следующих принципов: 20 до 4 штук, иначе 100. 50 - 1 шт иначе 1х100ка.
            if (money % 50 == 0) {//если сумма делиться без остатка на 50, или сумма равна 0!!!!
                array = nominalDistribution(money, array, baseBankomat, moneyBankomat);//в данном методе выполняется поиск оптимального соотношения номиналов
                flag = false;//цикл рабтает до тех пор, пока не отнимутся все 20, которые мешают стать кратным 50 или 0!
                // Как только код стал кратным 50, сразу проходим ветвление где вычисляем количество 50 и 100 и потом break
                break;
            }
            if (moneyBankomat[0][0] > array[0][0]) {
                money = money - 20; // тут считаем количество 20, их может быть до 4 штук. Отнимаем 20 ки пока не станет кратно 50!!!!!!!!! Основной гемор именно тут!!!!
                array[0][0] = array[0][0] + 1;
            } else {
                Task2_printOf.errorNoNominal(20);//если не хватает то ошибка
                flag = false;
            }
        }
        //модуль проверки:


        return array;
    }

    public static int[][] nominalDistribution(int money, int[][] array, int[][] baseBankomat, int[][] moneyBankomat) {


        if (moneyBankomat[2][0] >= money / 100)//если количество 100 в банкомате достаточно, то утверждаем значение
        {
            array[2][0] = money / 100;
            array[1][0] = money % 100 / 50;
        } //в массив добавляем сотни
        else {// если соток не хватает, то
            array[2][0] = moneyBankomat[2][0];//учитываем существующие сотки
            money -= array[2][0] * array[2][1];//отнимаем от счетчика учтенные в сотках деньги
            if (moneyBankomat[1][0] >= money / 50)//если 50 в банкомате хватает, то учитываем их.
            {
                array[1][0] = money / 50;
            }//в массив добавляем 50
            else {//если 50 не хватает, то


                if ((money / 50) % 2 == 0)//если 50 не хватает, то определяем, если количество 50 в нашем счетчике четное:
                {
                    array[1][0] = moneyBankomat[1][0] - moneyBankomat[1][0] % 2;//то заносим четное количество 50
                } //учитываем 50
                else {
                    array[1][0] = moneyBankomat[1][0] - 1 + moneyBankomat[1][0] % 2;//если нечетное, то заносим
                }


                money -= array[1][0] * array[1][1];//отнимаем от счетчика учтенные в 50 деньги
                if (moneyBankomat[0][0] >= money / 20) {//если 20 в банкомате хватает, то
                    array[0][0] += money / 20;//учитываем их
                    money -= array[0][0] * array[0][1];
                } else {
                    Task2_printOf.errorNoNominal(20);//если не хватает то ошибка
                }
            }
        }
        return array;
    }

}
