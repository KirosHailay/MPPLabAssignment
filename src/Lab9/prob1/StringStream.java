package Lab9.prob1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStream {
    public static void main(String [] args) {

    Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
        Stream<String> stringStream2 = Stream.of("Bill", "Thomas", "Mary");
        System.out.println(stringStream2.reduce((s1,s2)-> s1.concat("," + s2)).get());
//  join the collection of stream string using collectors joining
      String list = stringStream.collect(Collectors.joining(","));
      System.out.println(list);
    }
}
