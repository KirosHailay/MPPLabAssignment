package Exercise.Lesson8.Lesson9.exercise3;
import java.util.*;
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
		
		//sorting code here
		Collections.sort(accounts, Comparator.comparing(Account::getBalance).thenComparing(Account::getOwnerName));
		System.out.println(accounts);
	}

}
