package Exercise.Lesson8.Lesson9.exercise3;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	//Use Comparator.comparing and thenComparing to sort 
	//the list by balance and then by ownerName
	//Collect your stream into a list and print the sorted 
	//result to the console
	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<Account>() {
			{
				add(new Account("Bob", 5000, 1001));
				add(new Account("Jim", 10000, 1002));
				add(new Account("Bruce", 5300, 1003));
				add(new Account("Li", 12000, 1004));
				add(new Account("Sam", 9000, 1005));
				add(new Account("Rick", 11000, 1006));
			}
		};
		BiFunction<List<Account>, Integer, List<Account>> MYLIB = (list, f) -> {
			return list.stream().filter(e -> e.getBalance() > f).collect(Collectors.toList());
		};
		MYLIB.apply(accounts, 2000).forEach(x -> System.out.println(x.getOwnerName()));
		MYLIB.apply(accounts, 40000).forEach(x -> System.out.println(x.getOwnerName()));
		accounts.stream().filter(a -> a.getBalance() > 50000).collect(Collectors.toList());
		class A {
			public A() {

			}
			 boolean test() {
				return true;
			}
			public String toString(){
				return test() + "";
			}
		};

//		A a = new A();
//		accounts.stream().filter(A::test).collect(Collectors.toList());
		Stream.generate(A::new).limit(10).forEach(System.out::println);
//		s.forEach(System.out::println);
		//sorting code here
		Collections.sort(accounts, Comparator.comparing(Account::getBalance).thenComparing(Account::getOwnerName));
		System.out.println(accounts);
		MyF f = new MyF();
		List<Integer> n = Arrays.asList(1, 2, 3, 4,5, 6, 7);
		f.filter(n, (x) -> ((int) x) > 3).forEach(System.out::println);
	}

}

class MyF {
	public List<Integer> filter(List<Integer> nums, Predicate lambda) {
		List<Integer> r = new ArrayList<>();
		for (int i = 0; i < nums.size(); i++) {
			if(lambda.test(nums.get(i))) {r.add(nums.get(i));}
		}
		return r;
	}
}
