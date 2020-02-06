package zfinalExampractice;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test {
    int x;
    int y;

    public void display(int h) {
        int z  = 0;
        for (int i = 0; i< 5; i++) {
            int count = i;
            Consumer<String> con  = new Consumer<String>() {
                @Override
                public void accept(String s) {

                    System.out.println("Hey: " + h);
                }
            };
        }

        Stream<String> song
                = Stream.of("gently", "down", "the", "stream");


    }
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<? extends Number> list3 = new ArrayList<>();
        List<Number> list4 = new ArrayList<>();
//        list3.addAll(list);
//        list4.addAll(list);

        HashMap<String, Integer> s  = new HashMap<>();
//        s.containsKey()
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");
        System.out.println(words);
        words.stream().filter(w -> w.length() > 3).map(a -> a="world").forEach(System.out::println);
        System.out.println(words);
        Stream.iterate("x", x -> x.concat(x)).limit(4).forEach(System.out::println);
       Stream.iterate(1, x-> x +2 ).limit(8).skip(4).forEach(System.out::println);
       Stream.iterate(0, x-> x+2).limit(4).forEach(System.out::print);
       List<String> list2 = Arrays.asList("Eleven","Two");
//       String[] s = list2.stream().toArray(String[]::new);
//       System.out.println(Arrays.toString(s));

        String s1 = Stream.of("A", "good", "day", "to", "write", "some", "Java").reduce("", (x,y)-> x+ y + " ");
     String x2 =Stream.of("A", "good", "day", "to", "write", "some", "Java").reduce((x,y)-> new StringBuilder(x).append(" "+y ).toString()).get();


        System.out.println(s1);
        System.out.println(x2);
        Integer[] arr = new Integer[]{1,3,43,34,87,34};
        //Integer result = getMax(arr, 1,2);
//        System.out.println("Result is: "  + result);
    }

//    public static  <T extends Comparable<? super T>> T getMax(T[] arr, int begin, int end) {
//        return Stream.of(arr).limit(end+1).skip(begin).
//    }
}
