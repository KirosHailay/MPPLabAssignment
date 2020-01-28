package lab5.Lab5_1;

public class MallardDuck extends Duck {

    public MallardDuck(){
        setFly(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    @Override
    public void display() {
        System.out.println("  displaying");
    }

}
