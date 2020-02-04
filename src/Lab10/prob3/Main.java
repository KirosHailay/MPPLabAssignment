package Lab10.prob3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static<T extends Comparable<? super T>>boolean contains1(List<T> list, T s){
        for (T x: list) {
            if (x == null && s == null) return true;
            if (s == null || x == null)  continue;
            if (x.equals(s)) return true;
        }
        return false;
    }
    public static void test1() {
        List<String> list = Arrays.asList("Bob", "Joe", "Tom");
        boolean result = Main.contains1(list, "Tom");
        System.out.println(result);
    }

    public static void main(String[] args) {
        test1();
    }
}
