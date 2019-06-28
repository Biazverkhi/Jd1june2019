package Jd1june2019.Lection03;

public class Task6 extends Task1{

    public static void main(String[] args) {

     int[]array=new int[100];

    // for (int x=0;x<array.length;x++)
         int pos=0;
         int x=13;
         int y=17;
         int a=x,b=y;
         while(pos<=99)

         {

         if (x%13==0)
         {array[pos]=a;
         pos++;
         a=a+x;}

             if (y%17==0)
             {array[pos]=b;
                 pos++;b=b+y;}


         }







      printMassiv1(array);

    }

}
