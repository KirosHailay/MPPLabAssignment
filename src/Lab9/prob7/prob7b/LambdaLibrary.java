package Lab9.prob7.prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, Character, String> getName =
            (w,x,y) -> {
                return w.stream().filter(e -> e.getSalary() >= x)
                        .filter(e -> e.lastName.charAt(0) > y)
                        .map(e1 -> e1.firstName + " " + e1.getLastName())
                        .sorted()
                        .collect(Collectors.joining(", "));
            };
}
