package lab3.prob1.prob3;

public class Cylinder {
    private double height;
    private Circle circle;

    public Cylinder(double radius, double height) {
        this.height = height;
        circle = new Circle(radius);
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {

        return circle.getRadius();
    }

    public double computeVolume() {
        double volume = circle.computeArea() * height;
        return volume;
    }
}
