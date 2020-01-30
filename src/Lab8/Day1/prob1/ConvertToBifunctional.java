package Lab8.Day1.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class ConvertToBifunctional {
    public static void main(String [] args) {
        BiFunction<Double,Double, List<Double>> list = (x, y)-> {
            List<Double> list1 = new ArrayList<>();
            list1.add(Math.pow(x,y));
            list1.add(x * y);
            return list1;

        };
        List<Double> result = list.apply(2.0, 3.0);
        System.out.println(result);
    }
}
