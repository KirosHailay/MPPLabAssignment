package lab5.Lab5_1;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFly(new CannotFly());
        setQuackBehavior(new Squek());
    }
    @Override
    public void display() {
        System.out.println("  displaying");
    }
}
