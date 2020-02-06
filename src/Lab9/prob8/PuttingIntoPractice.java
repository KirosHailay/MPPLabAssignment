package Lab9.prob8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 40),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        System.out.println("Query 1: ");
        transactions.stream().filter(x -> x.getYear() > 2011).sorted(Comparator.comparing(Transaction::getValue)).
                forEach(System.out::println);
        // Query 2: What are all the unique cities where the traders work?
        System.out.println("Query 2: ");
        String result = transactions.stream().map(a -> a.getTrader().getCity()).distinct().collect(Collectors.joining(","));
        System.out.println(result);
        // Query 3: Find all traders from Cambridge and sort them by name.
        System.out.println("Query 3: ");
        transactions.stream().filter(t -> t.getTrader().getCity() == "Cambridge").map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName)).forEach(System.out::println);

        // Query 4: Return a string of all traders names sorted alphabetically.
        System.out.println("Query 4: ");
        transactions.stream().map(Transaction::getTrader)
                .map(Trader::getName).sorted().forEach(System.out::println);
        // Query 5: Are there any trader based in Milan?
        System.out.println("Query 4: ");
      boolean find = transactions.stream().anyMatch(t -> t.getTrader().getCity() == "Milan");
      System.out.println("is there any trader based in milan: " + find);
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.

        System.out.println("Query 5: ");
        transactions.stream().filter(t -> t.getTrader().getCity() == "Milan")
                .map(transaction -> {
                    transaction.getTrader().setCity("Cambridge");
                    return transaction;
                }).forEach(System.out::println);
        // Query 7: What's the highest value in all the transactions?
        Optional<Integer> maxValue = transactions.stream().map(t->t.getValue()).max((Integer::compareTo));
        maxValue.ifPresent(System.out::println);
    }
}
