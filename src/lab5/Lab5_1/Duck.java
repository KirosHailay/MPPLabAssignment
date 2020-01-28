package lab5.Lab5_1;

public abstract class Duck {
    private FlyBehavior fly;
    private QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("  swimming");
    }

    public abstract void display();

    public void setFly(FlyBehavior fly) {
        this.fly = fly;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void fly() {
        fly.fly();
    }

    public void  quack() {
         quackBehavior.quack();
    }
}
