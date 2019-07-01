package Jd1june2019.Lection04;

public class Task2_getArrayNominalAmount {
    public static int[][] getNominal(int money, Task2_Bankomat o) {//функция возвращает массив с количеством купюр по номиналу, которые надо выдать
        int array[][] = o.getBaseBankomat();// массив[количество][номинал]/ получили базовый массив с введенным при создании объектом номиналами но без количества.
        boolean flag = true;// флаг для цикла.
        // int money = money;// вспомогательная переменная с которой выполняем все операции. Передаваемая money остается не изменной для дальнейшей проверки
        while (flag) {
//расчет количества номиналов из следующих принципов: 20 до 4 штук, иначе 100. 50 - 1 шт иначе 1х100ка.
            if (money % 50 == 0) {//если сумма делиться без остатка на 50, или сумма равна 0!!!!
                if (money % 100 == 0) {// и если сумма делиться без остатка на 100
                    array[2][0] = money / 100; //в массив добавляем сотни
                } else {
                    array[2][0] = money / 100;//если не делиться на 100 без остатка, то добавляем стоню, !!если она есть !!, если нет, то в массив идет 0.
                    array[1][0] = 1;//плюсуем 1 50ку
                }
                flag = false;//цикл рабтает до тех пор, пока не отнимутся все 20, которые мешают стать кратным 50 или 0!
                // Как только код стал кратным 50, сразу проходим ветвление где вычисляем количество 50 и 100 и потом break
                break;
            }
            money = money - 20; // тут считаем количество 20, их может быть до 4 штук. Отнимаем 20 ки пока не станет кратно 50!!!!!!!!! Основной гемор именно тут!!!!
            array[0][0] = array[0][0] + 1;
        }
        return array;
    }
}

