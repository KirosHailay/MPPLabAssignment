package Lab9.prob2;


import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyIntStream {
    public static void main(String[] args) {


        IntSummaryStatistics intSummaryStatistics = Stream.of(23, 45, 6, 3, 67, 89, 54).collect(Collectors.summarizingInt(Integer::intValue));

        int maxValue = intSummaryStatistics.getMax();
        int minValue = intSummaryStatistics.getMin();

        System.out.println("The Maximum Value for the given stream is: " + maxValue);

        System.out.println("The Minimum Value for the given stream is: " + minValue);

    }


}
