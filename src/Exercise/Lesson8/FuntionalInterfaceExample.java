package Exercise.Lesson8;

import jdk.nashorn.internal.ir.FunctionCall;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FuntionalInterfaceExample {
    public static void main(String [] args) {

        List<String> str = Arrays.asList("a", "b", "A", "B");
        str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
//        str.sort(String::compareToIgnoreCase);
        System.out.println(str);

//        ToIntFunction<String> lengthFunction = str1 -> str1.length();

        // can converted to shortcut syntax
        ToIntFunction<String> lengthFunction = String::length;
        String name = "Ellen";
        int len = lengthFunction.applyAsInt(name);
        System.out.println("len: " + len);

        // function
        Function<String, String> function = String::toUpperCase;
        System.out.println(function.apply("hello"));
        MyFunctionalInterface<Integer> exp  = () -> {
            Random random = new Random();

            return random.nextInt(); };
        System.out.println(exp.getValue());

        // Method
        BiFunction<Integer, Integer, Double> f =
                (x,y) -> Math.pow(x,y);
        System.out.println(f.apply(5,6));
//        System::out::

        Function<String, String> ob = x -> x.toUpperCase();
        Function<String, String> ob1 = String::toUpperCase;
        System.out.println(ob.apply("java"));
        System.out.println(ob1.apply("java"));


//        MyTriFunction<Integer> exp = (x, y, z) -> 2 *x-y+z;
//        System.out.println("Result: " + exp.apply(2, 3, 4));
//        BiFunction<Integer, Float, Float> exp = (x,y) -> 2*x -y;
//         float result = exp.apply(4, 5f);
//        System.out.println(result);
//
//        Function<Float, Double> convert = (x) -> 1.6 * x;
//        Float miles = 475f;
//        Double converted = convert.apply(miles);
//        System.out.println(converted);

    }
}
