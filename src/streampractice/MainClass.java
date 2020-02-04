package streampractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //1. Find all transactions in the year 2011 and sort them by value (small to high).
        System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high).");
        transactions.stream().filter(transaction -> transaction.getYear() == 2012)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

//        2. What are all the unique cities where the traders work?
        System.out.println("2. What are all the unique cities where the traders work?");
        transactions.stream().map(transaction -> transaction.getTrader().getCity())
                .distinct().forEach(System.out::println);

//        3. Find all traders from Cambridge and sort them by name.
        System.out.println("3. Find all traders from Cambridge and sort them by name.");
        transactions.stream().filter(transaction -> transaction.getTrader().getCity() == "Cambridge")
                .map(transaction -> transaction.getTrader()).sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

//       4. Return a string of all traders’ names sorted alphabetically
        System.out.println("4. Return a string of all traders’ names sorted alphabetically");
       List<String>  list = transactions.stream().map(transaction -> transaction.getTrader())
                .map(Trader::getName).sorted().collect(Collectors.toList());
       list.forEach(System.out::println);

//        5. Are any traders based in Milan?

        boolean any = transactions.stream().map(transaction -> transaction.getTrader())
                .anyMatch(trader -> trader.getCity()=="Milan");
        System.out.println("5. Are any traders based in Milan? " + any );

//        6. Print all transactions’ values from the traders living in Cambridge.
        transactions.stream().filter(transaction -> transaction.getTrader().getCity()=="Cambridge")
                .map(transaction -> transaction.getValue())
                .forEach(System.out::println);

//       7. What’s the highest value of all the transactions?
       Optional<Integer> x =  transactions.stream().filter(transaction -> transaction.getTrader().getCity()=="Cambridge")
                .map(transaction -> transaction.getValue()).reduce(Integer::max);
       x.ifPresent(System.out::println);
//        8. Find the transaction with the smallest value.

        Optional<Integer> min =  transactions.stream().filter(transaction -> transaction.getTrader().getCity()=="Cambridge")
                .map(transaction -> transaction.getValue()).reduce(Integer::min);
        min.ifPresent(System.out::println);

        Stream<Integer> findMax = Stream.of(1,2,3 ,4,5);

        Optional<Integer> optionalInteger = findMax.max((y1,y) -> y1.compareTo(y));
        optionalInteger.ifPresent(System.out::print);
    }
}
