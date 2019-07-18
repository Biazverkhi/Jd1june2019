package Jd1june2019.Lection12.Task4;

import Jd1june2019.Lection12.Task4.MyException;

public class Test {


    public static void main(String[] args) {//понятна разница между runtime и exception
    //    try {
            divNull();
      //  } catch (MyException e) {
     //       e.printStackTrace();
    //    }
    }

    public static void divNull() throws MyException {
        int i = 0;
        int j = 10;
        if (i == 0)throw new MyException("Деление на ноль");

     //   int x = j / i;


    }


}
