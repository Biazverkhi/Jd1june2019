package Jd1june2019.Lection17.Task5;


public class Person {
  private final String firstName;
    private final String lastName;
    private final Integer age;

    public Person(String firstName, String lastName,Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }



}
