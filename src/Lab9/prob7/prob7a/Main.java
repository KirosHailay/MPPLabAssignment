package Lab9.prob7.prob7a;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//your stream pipeline here
		String value = list.stream().filter(e -> e.getSalary() >= 100000)
				.filter(e -> e.lastName.charAt(0) > 'M')
				.map(e1 -> e1.firstName + " " + e1.getLastName())
				.sorted()
				.collect(Collectors.joining(", "));

		System.out.println(value);

	}

}
