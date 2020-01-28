package Lab7.prob2;

public interface Polygon extends ClosedCurve {
    default double computePerimeter() {
        double perim = 0;
        for(double a: getLength()) {
            perim += a;
        }
        return perim;
    }

    double [] getLength();
}
