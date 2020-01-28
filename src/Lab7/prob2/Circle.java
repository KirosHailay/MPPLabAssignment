package Lab7.prob2;

public class Circle implements ClosedCurve {

    // I am making the instance field public since the class diagram say so
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double computePerimeter() {
        return 2*Math.PI*radius;
    }
}
