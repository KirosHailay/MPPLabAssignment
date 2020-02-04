package Lab10.prob2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallest {

    static <T extends Comparable<? super T>> T secondSmallest(List<T> list){
        return list.stream().sorted().distinct().skip(1).min(T::compareTo).get();
    }

    public static void main(String [] args) {
        LocalDate secondSmallest = secondSmallest(Arrays.asList(LocalDate.of(2010, 10, 15), LocalDate.of(1994, 02, 15), LocalDate.of(1984, 12, 25),
                LocalDate.now()));
        System.out.println(secondSmallest);
        Integer secondSmallest2 = secondSmallest(Arrays.asList(1,2,3,4,5));
        System.out.println(secondSmallest2);
    }
}
