package Jd1june2019.Lection12;

public class Task2 {

    public static void main(String[] args) {

        try {
            int [] array=new int[10];
            for (int i=0;i<=array.length;i++){
                System.out.println(array[i]);
            }


        }catch (ArrayIndexOutOfBoundsException e)

        {

            System.out.println("Вышли за границу массива");



        }




    }


}
