package Jd1june2019.Lection03;

public class Task12 extends Task11 {
    public static void main(String[] args) {
        String[] cards = new String[]{"Jack", "Queen", "King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] suit = new String[]{"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] arrayCard = toTheCardList(cards, suit);//создаем упорядочненный массив
        String[] newArrayCard = new String[arrayCard.length];//создаем новый рандомный массив
        boolean[] arrayFlag = new boolean[newArrayCard.length];//создаем флаговый массив, который будет исключать повтор
        for (int i = 0; i < newArrayCard.length; i++) {
            int x = (int) (Math.random() * 52);
            if (!arrayFlag[x]) {
                newArrayCard[i] = arrayCard[x];
                arrayFlag[x] = true;
            } else i--;
        }
        printMassiv2(arrayCard, newArrayCard);
    }
    static void printMassiv2(String[] array, String[] array2) {
        for (int i=0;i<array.length;i++) {
                System.out.printf("%-17s| %-16s\n", array[i], array2[i]);

        }
    }
}