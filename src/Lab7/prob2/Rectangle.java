package Lab7.prob2;

public class Rectangle implements Polygon {

    // I am making the instance field public since the class diagram say so
    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double[] getLength() {
        return new double[]{
               length, width, length, width
        };
    }
}
