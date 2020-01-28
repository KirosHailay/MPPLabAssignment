package Lab7.prob2;

public class Ellipse implements ClosedCurve {

    // I am making the instance field public since the class diagram say so
    public double semiaxis;
    public double elateral;

    public Ellipse(double semiaxis, double elateral) {
        this.semiaxis = semiaxis;
        this.elateral = elateral;
    }
    @Override
    public double computePerimeter() {


        return 4*semiaxis*elateral;
    }
}
