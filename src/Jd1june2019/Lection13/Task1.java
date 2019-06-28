package Jd1june2019.Lection13;


public class Task1 {
    public static void main(String[] args) {
        String text="text ";
        StringBuilder text2=new StringBuilder("text ");
        long time=System.currentTimeMillis();
        for(int i=0;i<20000;i++){
            text=text+"text ";
        }
time=System.currentTimeMillis()-time;
        System.out.println(time);




        long time2=System.currentTimeMillis();


        for(int i=0;i<200000;i++){
            text2=text2.append("text ");
        }
        time2=System.currentTimeMillis()-time2;
        System.out.println(time2);




    }
}
