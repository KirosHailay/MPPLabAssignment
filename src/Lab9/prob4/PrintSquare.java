package Lab9.prob4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintSquare {
    public static void printSquare(int num) {

        System.out.println( Stream.iterate(1, x -> x + 1).limit(num)
                .map(x -> x * x).map(x -> x.toString())
                .collect(Collectors.joining(",")));
    }

    public static void main(String [] args) {

        printSquare(4);
    }
}
