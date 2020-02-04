package Lab9.prob3;

import java.util.ArrayList;
import java.util.List;

public class CreateMethod {
    public int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream().filter(x -> x.length() == len)
                .map(String::toLowerCase)
                .filter(x -> x.indexOf(c) != -1 ? true : false)
                .filter(x -> x.indexOf(d) == -1 ? true : false)
                .count();

    }

    public static void main(String [] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("cowd");
        words.add("crook");
        words.add("cdrick");
        int value = new CreateMethod().countWords(words, 'O', 'L', 4);
        System.out.println("The Returned Value is =  " +value);
    }
}
