package Jd1june2019.Lection13;

public class Task4 {
    public static void main(String[] args) {
String fio=fio("Безверхий", "Алексей", "юрьевич");
        System.out.println(fio);
    }

    public static String fio(String lastName, String firstName, String otchestvo){
String fio = null;
char lN=lastName.charAt(0);
char fN=firstName.charAt(0);
char o=otchestvo.charAt(0);
fio=fio.valueOf(lN)+"."+fio.valueOf(fN)+"."+fio.valueOf(o);
fio=fio.toUpperCase();

    return fio;}



}
