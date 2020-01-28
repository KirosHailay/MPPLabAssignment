package lab5.Lab5_1;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        setFly(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    @Override
    public void display() {
      System.out.println("  displaying");
    }
}
