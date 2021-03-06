package Lab9.prob9;
import java.math.BigInteger;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Type.MEAT),
                           new Dish("beef", false, 700, Type.MEAT),
                           new Dish("chicken", false, 400, Type.MEAT),
                           new Dish("french fries", true, 530, Type.OTHER),
                           new Dish("rice", true, 350, Type.OTHER),
                           new Dish("season fruit", true, 120, Type.OTHER),
                           new Dish("pizza", true, 550, Type.OTHER),
                           new Dish("prawns", false, 400, Type.FISH),
                           new Dish("salmon", false, 450, Type.FISH));

    public static void main(String[] args) {
        //    a. Is there any Vegetarian meal available ( return type boolean)
        boolean match = menu.stream().anyMatch(m-> m.vegetarian);
        System.out.println("Is there any Vegetarian meal available? " + match);

//        b. Is there any healthy menu have calories less than 1000 ( return type boolean)
        boolean find = menu.stream().anyMatch(m-> m.getCalories()<1000);
        System.out.println("Is there any healthy menu have calories less than 1000? "+find);

        // c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
        boolean find2 = menu.stream().anyMatch(m-> m.getCalories()>1000);
        System.out.println("Is there any unhealthy menu have calories greater than 1000? " + find2);

    // d. find and return the first item for the type of MEAT( return type Optional<Dish>)
        menu.stream().filter(d->d.getType().equals(Type.MEAT)).findFirst();


    // e. calculateTotalCalories() in the menu using reduce. (return int)
     menu.stream().map(d->d.getCalories()).reduce((x,y)->x+y).get();


    // f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
        menu.stream().map(d->d.getCalories()).reduce(Integer::sum).get();



    }
}