package Jd1june2019.Lection17.Task5;


import java.util.Arrays;
import java.util.Collection;

public class Task5 {
    public static void main(String[] args) {
        Collection<Person> person = Arrays.asList(
                new Person("Aliaksei", "Biazveyyyy", 36),
                new Person("dsddsddd", "dsddsd", 35),
                new Person("Ali", "weqfqwefq", 32),
                new Person("wwwwwwwwwwAliaksei", "Biazverkhi", 31)
        );
     Person name = person.stream()
             .filter(p->(p.getLastName().length()+p.getFirstName().length())<15)
             .max((p1, p2) -> p1.getAge().compareTo(p2.getAge())).get();
             System.out.println(name.getFirstName()+" "+name.getLastName());


    }


}
