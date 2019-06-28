package Jd1june2019.Lection02;

import java.util.Scanner;

public class Task1 {
    String word1, word2;

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.word1 = task1.input();
        task1.word2 = task1.input();


        if (task1.word1.equals(task1.word2))
            System.out.println("Отлично! Слова одинаковы");
        else if (task1.word1.equalsIgnoreCase(task1.word2))
            System.out.println("Хорошо. Почти одинаковы");
        else if (task1.word1.length() == task1.word2.length())

            System.out.println("Ну, хотя бы они одной длины");
        else
            System.out.println("Ошибка");

    }

    String input() {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        // inputFromKeyB.close();
        return word;
    }

    ;


}
