package Jd1june2019.Lection04;

import java.util.Scanner;

public class Task2_Input {
    private Task2_Input() {
    }

    public static int inputMoney(){
        Task2_printOf.inputMoney();
        Scanner sc = new Scanner(System.in);
        int input =sc.nextInt();
        //sc.close();



   return input; }

    public static String inputYesNo() {
        Scanner sc1 = new Scanner(System.in);
        String inputYesNo = sc1.nextLine();
        //sc1.close();


        return inputYesNo;
    }





}
