package Lab9.prob6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class UnionMethod {

    public Set<String> union(List<Set<String>> sets) {
        Optional<Set<String>> result = sets.stream().reduce((x, t) ->
        { x.addAll(t);

        return x;
        });
        if (result.isPresent())
            return result.get();
        return null;
    }

    public static void main(String[] args) {
        UnionMethod u = new UnionMethod();
        Set<String> set1  = new HashSet<>();
        set1.add("A");
        set1.add("B");
        Set<String> set2  = new HashSet<>();
        set2.add("A");
        set2.add("B");
        Set<String> set3  = new HashSet<>();
        set3.add("1");
        set3.add("2");
        List<Set<String>> list = new ArrayList<>();
        list.add(set1);
        list.add(set2);
        list.add(set3);
        System.out.println(u.union(list));

    }

}
