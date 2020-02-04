package streampractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );


        // get name from dish with low calories
        List<String> names = menu.stream().filter(dish -> dish.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(dish -> dish.getName()).limit(3).collect(Collectors.toList());
        // outputing the result
        System.out.println(names);
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream().filter(i -> i%2 == 0).distinct().skip(2).collect(Collectors.toList())
                .forEach(System.out::println);

        // How would you sue streams to filter the first two meat dishes?
        List<Dish> dishes = menu.stream().filter(d ->d.getType() == Dish.Type.MEAT)
                .limit(2).collect(Collectors.toList());

        // Given a list of words, you'd like to return a list of the number of characters for each word.
        List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
        List<Integer> numCharacters = words.stream().map(String::length).collect(Collectors.toList());
        numCharacters.forEach(System.out::print);
        List<Integer> dishNameLength = dishes.stream().filter(d -> d.getCalories() > 300)
                .map(Dish::getName).map(String::length).collect(Collectors.toList());
        System.out.println("Dish Name Lenght");
        dishNameLength.forEach(System.out::println);

        // convert arrays to stream
        String[] arrayOfWords = {"Goodbye", "World"};
        Stream<String> stringStream = Arrays.stream(arrayOfWords);
        stringStream.map(w -> w.split(""))
                .map(Arrays::stream)
                .distinct().forEach(System.out::println);

        List<String> list = Arrays.stream(arrayOfWords).map(w -> w.split(""))
                .flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        list.forEach(System.out::print);

        // given a list of integer map it in to their square
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4,5);
        integerList.stream().map(x -> x * x).forEach(System.out::print);

        // given a two list of numbers how would you return all pairs of numbers?
        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(3,4);
        List<int[]> pairs = numbers1.stream().
                flatMap(i -> numbers2.stream().map(j -> new int[]{i,j})).collect(Collectors.toList());

        // create pairs only if their sum is divisible by three
        List<int[]> disvisbleByThree = numbers1.stream().flatMap(i -> numbers2.stream().filter(j -> (i+j)%3==0).map(
                j -> new int[]{i,j}
        )).collect(Collectors.toList());
        pairs.forEach(System.out::print);

        if(menu.stream().anyMatch(d -> d.getCalories() < 1000)){
            System.out.println("Yes there are");
        }
        if(menu.stream().allMatch(d -> d.getCalories() < 1000)){
            System.out.println("Yes there are");
        }
        if(menu.stream().noneMatch(d -> d.getCalories() >= 1000)){
            System.out.println("Yes there are");
        }

        menu.stream().filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(d -> System.out.println(d.getName()));

        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstSquareDivsibleByThree =
                someNumbers.stream().map(x -> x *x)
                .filter(x -> x % 3 == 0).findFirst();
        firstSquareDivsibleByThree.ifPresent(value -> System.out.println(value));
//        Optional<Integer> sum = menu.stream().reduce()

    }

}
