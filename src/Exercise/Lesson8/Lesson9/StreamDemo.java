package Exercise.Lesson8.Lesson9;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static  void main(String [] args) {

        System.out.println("FlatMap");
//        Stream<Integer> res = Stream.of(1, 2,3)
        List<String> list = new ArrayList<>(
                Arrays.asList("Java", "Java Fx", "Jquery", "HTML"));

        List<String> list2 = new ArrayList<>(
                Arrays.asList("C++", "Android", "Kotlin", "CSS"));
        Optional<String> list4 = list2.stream().filter(s -> s.startsWith("A")).findAny();
        list4.ifPresent(System.out::println);
//        list2.stream().filter(name -> name.startsWith("A")).map(x -> x.toUpperCase());
//        Comparator<String> t = (e1, e2) -> {
//            return e1.compareTo(e2);
//        };
//
//        Collections.sort(list2, t);
       long count = list.stream(). //1 creation of stream
                filter(x -> x.startsWith("J")) // 2 Intermedaite Operation
               .count();
        List<String> strings = list.stream(). //1 creation of stream
                filter(x -> x.startsWith("J")) // 2 Intermedaite Operation
                .collect(Collectors.toList());
        list.stream(). //1 creation of stream
                filter(x -> x.startsWith("J")) // 2 Intermedaite Operation
                .forEach(System.out::println);
                //.forEach(x ->System.out.println(x));

        // Different way of creating stream
        Integer[] arrayOfInt ={1,2, 3,7};
        Stream<Integer> stream = Stream.of(arrayOfInt);
        Stream<Integer> filter1 = stream.filter(x -> x % 2 == 1);
        filter1.forEach(System.out::println);

        // other way of creating stream
        Stream<String> song = Stream.of("Hello", "go", "come", "by");
        // generate accepts supplier interface slide 16
        Stream<String> inf = Stream.generate(() -> "Java").limit(10);
        inf.forEach(System.out::println);

        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        // iterate accepts unaryoperatot
        Stream.iterate(1, x -> x+1)
                .limit(10)
                .skip(5)
                .forEach(System.out::println);

        // Stream Concatnation -slide 19
//        List<String> combo = Stream.concat(list.stream(), list2.stream())


        Stream.iterate(1, x -> x+1)
                .filter(x -> x % 2 == 1)
                .skip(3)
                .limit(5)
                .forEach(System.out::println);

        int[] arrOfInt = {1, 3, 5, 7};
//one-element Stream
        Stream<int[]> strOfInt = Stream.of(arrOfInt);
        System.out.println(strOfInt);
        List<String> stringStream = strOfInt.map(Arrays::toString)
                .collect(Collectors.toList());
        System.out.println(stringStream);

        Stream<Double> integerStream = Stream.generate(Math::random).limit(5);

        integerStream.forEach(System.out::println);

        String outputMessage = "hello";
        outputMessage += Optional.ofNullable("Renuka").orElse("World");

        List<Integer> num = new ArrayList<>(Arrays.asList(12,13,10,5,6,7));
        int sum = num.stream().reduce(0, (x,y) -> x+y);
        int sum2 = num.stream().reduce(0,Integer::sum);
        System.out.println("Sum is: " + sum);
        System.out.println("Sum2 is: " + sum2);


        Optional<Integer> sum1 = num.stream().reduce(Integer::sum);
        System.out.println("Sum1 is: " + sum1);
        Stream<String> str1 = Stream.of("A", "good", "day","to", "write", "some", "Java");
//       Optional<String> result = str1.reduce(s,tlk)
//       System.out.println(result);

    }
}
