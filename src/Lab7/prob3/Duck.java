package Lab7.prob3;

public interface Duck {

    default void fly() {
        System.out.println("  fly with wings");
    }

    default void swim(){
        System.out.println("  swimming");
    }

    default void quack() {
        System.out.println("  quacking");
    }


     default void display() {
         System.out.println("  displaying");
     }
}
