package Jd1june2019.Lection03;

public class Task11 {


    public static void main(String[] args) {
        String[] cards = new String[]{"Jack", "Queen", "King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] suit = new String[]{"Hearts", "Spades", "Clubs", "Diamonds"};

        //   String[] cardsArray = toTheCardList(cards, suit);
       String card = toTheCardRandom(cards, suit);
        System.out.println(card);
      //  printMassiv1(cardsArray);

    }


    static String toTheCardRandom(String[] array, String array2[]) {
        String text1 = array[(int) (Math.random() * array.length)];
        String text2 = array2[(int) (Math.random() * array2.length)];
        String text = text1 + " to " + text2;
        return text;
    }


    static String[] toTheCardList(String[] array, String array2[]) {

        int pos = array.length * array2.length;
        String text[] = new String[pos];

        for (String x : array) {
            for (String y : array2) {

                text[pos-1] = x + " to " + y;
                pos--;
               // if (pos==0) continue;



            }
        }

        return text;
    }
    static void printMassiv1(String[]array){

        for (String x:array
                ) {
            System.out.println(x+", ");

        }
        System.out.println();




    }


}
