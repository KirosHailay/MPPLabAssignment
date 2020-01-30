package Lab8.Day2.prob1.prob3;

import java.util.Arrays;
import java.util.List;

public class PrintList {

    public static void main (String [] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");

        // printing using the long way of lambda
        fruits.forEach(s -> System.out.print(s));

        System.out.println();
        // print given list using method reference
        fruits.forEach(System.out::print);
    }
}
