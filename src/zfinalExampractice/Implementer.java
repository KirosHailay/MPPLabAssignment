package zfinalExampractice;

import java.util.ArrayList;
import java.util.List;

public class Implementer implements interface1 {
    static List<Integer> source = new ArrayList<>();
    static List<? super Integer> destination = new ArrayList<>();

    public static void main(String[] args) {
        source.add(1);
        source.add(2);
        source.add(3);
        source.add(4);
        source.forEach(e -> destination.add(e));
        destination.forEach(System.out::println);
    }

}
