``` java
public class Person {

    private String name;
    private String gender;
    private int age;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
```