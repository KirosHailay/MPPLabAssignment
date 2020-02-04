package Lab9.prob10;

import Lab9.prob7.prob7b.TriFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};
	
    // Query 1  : Print only Female canditates names
	System.out.println("Query 1: Print Female candidates names");
	Stream.of(list).filter(human -> human.gender == "Female").map(human -> human.getName()).forEach(System.out::println);

    // Query 2 : Create an object by choosing suitable Interface to the specified constructors(Totally 3 constuctors)using fourth type of Method Reference ClassName::new. Then print the object status
	System.out.println("Query 2: ");
	Function<String, Human> cons1 = Human::new;
	Human human1 = cons1.apply("Judy");
	System.out.println(human1);
	BiFunction<String, Integer, Human> cons2 = Human::new;
	Human human2 = cons2.apply("Jhon", 34);
	System.out.println(human2);
	TriFunction<String, Integer, String, Human> cons3 = Human::new;
	System.out.println(cons3.apply("Torres", 32, "Male"));
 
	// Query 3 : Count the male candidates whose age is more than 30
	System.out.println("Query 3: ");
    long total = Stream.of(list).filter(human -> human.getGender() == "Male" && human.getAge() > 30).count();
    System.out.println("The total count is: " + total);
    
    
   }



}
