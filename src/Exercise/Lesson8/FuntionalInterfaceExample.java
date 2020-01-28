package Exercise.Lesson8;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FuntionalInterfaceExample {
    public static void main(String [] args) {

        MyFunctionalInterface<Integer> exp  = () -> {
            Random random = new Random();

            return random.nextInt(); };
        System.out.println(exp.getValue());

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
