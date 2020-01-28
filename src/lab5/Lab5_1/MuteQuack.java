package lab5.Lab5_1;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("  cannot quack");
    }
}
