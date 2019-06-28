package Jd1june2019.Lection13;

public class Task6 {
    public static void main(String[] args) {
String text="aaabbccdeeaaffa";
String text2=itCopyDel(text);
        System.out.println(text+"\n"+text2);
    }
    public static String itCopyDel(String text){
      StringBuilder text2=new StringBuilder(text);
for (int i=0;i<text2.length()-1;i++)

{
    for (int j=i+1;j<text2.length();j++)
    {
        if (text2.charAt(i)==text2.charAt(j))
        {text2.deleteCharAt(j);
        j--;}
        else
        {break;}

    }

}

    String text3=String.valueOf(text2);


    return text3;}

}
