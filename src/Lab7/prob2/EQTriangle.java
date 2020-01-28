package Lab7.prob2;

public class EQTriangle implements Polygon {

    // I am making the instance field public since the class diagram say so
    public double side;

    public EQTriangle(double side) {
        this.side = side;
    }

    @Override
    public double[] getLength() {

       return new double[]{
                side, side, side
        };

    }
}
