package Exercise.Lesson8.Lesson9.exercise3;

public class Person {
    private Address address;
    private String name;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
