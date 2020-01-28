package Lab7.prob3;



public class DecoyDuck implements Duck{

    @Override
    public  void fly() {
        System.out.println("  cannot fly");
    }

    @Override
    public  void quack() {
        System.out.println("  cannot quack");
    }
}
