package Exercise.Lesson8;

@FunctionalInterface
public interface MyTriFunction<T,U,V,R> {

    R apply(T x, U y, V z);
    default void test(){
        System.out.println("Adding default can be added to the ");
    }
}
