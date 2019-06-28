package Jd1june2019.Lection03;

public class Task5 extends Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 1, 4, 0, 3, 4, 3, 5, 2, 0};

   printMassiv1(array);
printMassivObr(array);
    }


static void printMassivObr(int [] array){
        for (int x=(array.length-1);x>=0;x--){
            System.out.print(array[x]+", ");
        }
}
}
