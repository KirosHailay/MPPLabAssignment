package Exercise.Lesson8.Lesson9;

import Exercise.Lesson8.Lesson10.Pair;
import Lab8.Day2.prob1.prob2.MathRandom;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemoCode {
    public static void main(String [] args) {
        // different way of creating stream

        // 1. creating stream from the collection by calling stream()
        List<String> strings = new ArrayList<>();
        Stream<String> stringStream = strings.stream();

        // 2. create a steam from array of objects
        Integer[] arrOfInt = {1, 3, 5, 7};
        Stream<Integer> stream = Stream.of(arrOfInt);
        stream.map(x -> x.toString()).forEach(System.out::print);

        // but we can't do  this with permitive datatype array
        // I don't why but it's working

        int[] array = new int[] {1,2, 3, 4, 5};
        Stream<int[]> stream1 = Stream.of(array);
        stream1.map(x -> x.toString()).forEach(System.out::print);

        // Get stream from any sequence of arguments: (The of method accepts
        // a varargs argument

        Stream<String> song = Stream.of("gently", "you", "did");
        song.forEach(System.out::print);

        // Generate infinite streams using generator and iterator
        Stream<Double> integerStream = Stream.generate(Math::random);
        Stream<String> stringStream1 = Stream.generate(() -> "Echo").
                limit(10).skip(9);
        stringStream1.forEach(System.out::println);
//        Optional<Integer> sum = stringStream1.map((x) -> 1).reduce(Integer::sum);

//        sum.ifPresent(System.out::print);
//        Generate infinite stream using iterator by providing seed value
        Stream<Integer> integerStream1 = Stream.iterate(1, x -> x + 1);

        // all odd natural number
        List<Integer> oddNumber = Stream.iterate(1, x -> x + 2)
                .skip(4).limit(4).collect(Collectors.toList());
        oddNumber.forEach(System.out::println);

        List<String> labels = new ArrayList<>();
        labels.stream().map(Button::new);

        // String creatorz
        Function<char[], String> myFunc = String::new;
        char[] charArray =
                {'s','p','e','a','k','i','n','g','c','s'};
        Function<char[], String> myFunc2 = c-> new String(c);
        System.out.println(myFunc.apply(charArray));
        System.out.println(new String(charArray));
        System.out.println(myFunc2.apply(charArray));

        // Array constructor reference and the toArray method
        Stream<String> stringStream2 = Stream.of("hello", "by", "come", "some", "words");
        String[] vals = stringStream2.toArray(String[]::new);
        System.out.println(Arrays.toString(vals));

        Stream<Integer> integerStream2 =  Stream.of(1,23,34, 56, 76);
        Integer[] vals2 = integerStream2.toArray(Integer[]::new);
        System.out.println(Arrays.toString(vals2));

        int[] a = new int[]{4,5,3,4,4,5};
        Stream<int[]> intstream4 = Stream.of(a);
        System.out.println(Arrays.toString(a));

        List<Integer> ints = Arrays.asList(3,5,2,3,8);
        List<int[]> intArrs = ints.stream().map(int[]::new).collect(Collectors.toList());
        List<String> intarrStr = intArrs.stream().map(Arrays::toString)
                .collect(Collectors.toList());
        System.out.println(intarrStr);

        // trying the difference between map and flat map

        Stream.of(1,2,3).map(x -> x *x).forEach(System.out::print);
        Stream.of(1,2,3).flatMap(n->Stream.of(n, n*n))
                .forEach(System.out::print);

        //sort by decreasing lengths of words
        List<String> words
                = Arrays.asList("Richard", "Joseph", "Tom");

       List<String> longest = words.stream().sorted((x,y) -> x.length() -y.length()).collect(Collectors.toList());
        System.out.println(longest);

        // IMplementing Comparator more in functional style
        List<String> words2
                = Arrays.asList("Richard", "Joseph", "Tom");
        words2.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

        List<String> nullcheaker
                = Arrays.asList("Richard", "Joseph", "Tom");
        Optional<String> value1 = nullcheaker.stream().filter(x -> x.startsWith(""+'R')).findFirst();
        System.out.println(value1.orElse("No Name starts with letter R"));

    Optional<Double> Rvalue = inverse(4.0);
    System.out.println(Rvalue.orElse(0.0));
    Rvalue.ifPresent(System.out::print);

    String x  =creatOutPut();
    System.out.println(x);
    }

    // creating optional
    public static Optional<Double> inverse(Double x) {
        return x == 0 ? Optional.empty() : Optional.of(div(1.0,x));
    }

    private static Double div(Double a, Double b) {
        if (b == 0) return null;
        return a/b;
    }

    static String readInput() {
        return null;
    }
    static String creatOutPut() {
        String outputMessage = "Hello ";
        outputMessage += Optional.ofNullable(readInput()).orElse("world");
        return outputMessage;
    }
}
