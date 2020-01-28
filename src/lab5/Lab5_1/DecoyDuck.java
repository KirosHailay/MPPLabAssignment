package lab5.Lab5_1;

public class DecoyDuck extends  Duck{

    public DecoyDuck(){
        setFly(new CannotFly());
        setQuackBehavior(new MuteQuack());
    }
    @Override
    public void display() {
        System.out.println("  displaying");
    }
}
