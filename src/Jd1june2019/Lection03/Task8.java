package Jd1june2019.Lection03;

public class Task8 extends Task1 {


    public static void main(String[] args) {
        int [] array=new int[3];
        int flag=0;
        for (int x=0;x<array.length;x++) {
            array[x]=(int)(10+Math.random()*89);
            if (x>0&&array[x]>array[x-1]){
                flag=flag+1;
            }
            //else flag=flag;
        }



printMassiv1(array);
if (flag==2)
    System.out.println("массив является строго возрастающей последовательностью");
else System.out.println("массив не является строго возрастающей последовательностью");

    }
}
