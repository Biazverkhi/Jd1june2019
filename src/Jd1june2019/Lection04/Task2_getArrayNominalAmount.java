package Jd1june2019.Lection04;

public class Task2_getArrayNominalAmount {
    public static int[][] getNominal(int money, Task2_Bankomat o) {//функция возвращает массив с количеством купюр по номиналу, которые надо выдать
        int array[][] = o.getBaseBankomat();// массив[количество][номинал]/ получили базовый массив с введенным при создании объектом номиналами но без количества.
        boolean flag = true;// флаг для цикла.
        int moneyRashcet = money;// вспомогательная переменная с которой выполняем все операции. Передаваемая money остается не изменной для дальнейшей проверки
        while (flag) {
          //  if (money < 20 || money == 30 || money % 10 != 0) {//проверка. если ввели сумму меньше мин номинала, или которую нельзя выдать - возвращаем пустой массив
         //       break;}

            if (moneyRashcet % 50 == 0) {//если сумма делиться без остатка на 50
                if (moneyRashcet % 100 == 0) {// и если сумма делиться без остатка на 100
                    array[2][0] = moneyRashcet / 100; //в массив добавляем сотни
                }
                else
                    {
                    array[2][0] = moneyRashcet / 100;//если не делиться на 100 без остатка, то добавляем стоню, если она есть и одну 50.
                    array[1][0] = 1;
                }

                flag = false;
                break;
            }
            moneyRashcet = moneyRashcet - 20; // тут считаем количество 20, их может быть до 4 штук.
            array[0][0] = array[0][0] + 1;
        }
    return array;
    }


}

