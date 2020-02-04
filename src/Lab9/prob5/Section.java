package Lab9.prob5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section {
    public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
        return stream.limit(n+1).skip(m);
    }
    public static void main (String[] args) {
       String s1 =  streamSection(nextStream(), 1, 6).collect(Collectors.joining(" "));
        System.out.println(s1);
       String s2 =  streamSection(nextStream(), 2, 6).collect(Collectors.joining(" "));
        System.out.println(s2);
        String s3 = streamSection(nextStream(), 3, 2).collect(Collectors.joining(" "));
        System.out.println(s3);

    }

    //support method for the main method -- for testing
    private static Stream<String> nextStream() {
        return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
                "iii").stream();
    }
}
