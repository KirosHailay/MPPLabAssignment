package Exercise.Lesson8.Lesson9.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String [] args) {
        List<Person> personList = new ArrayList<>();
        Address a1 = new Address("New York");
        Address a2 = new Address("FairField");
        Address a3 = new Address("DC");

        Person person = new Person("Kiros", a2);
        Person person1 = new Person("Gere", a1);
        Person person2 = new Person("zeraburuk", a3);

        personList.add(person);
        personList.add(person1);
        personList.add(person2);

        for (Person p: personList) {
            if (Optional.ofNullable(p).map(x -> x.getAddress()).map(x->x.getCity())
            .orElse("").equals("FairField")) {
                System.out.println("true");
            }
        }

    }
}
