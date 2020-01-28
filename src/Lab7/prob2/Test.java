package Lab7.prob2;

public class Test {
    public static void main(String [] args) {
        Circle circle = new Circle(4);
        System.out.println("The Perimeter for the Circle is: "+ circle.computePerimeter());
        Ellipse ellipse = new Ellipse(4, 4);
        System.out.println("The Perimeter for the Ellipse is: "+ ellipse.computePerimeter());
        Rectangle rectangle =  new Rectangle(4,3 );
        System.out.println("The Perimeter for the Rectangle is: " + rectangle.computePerimeter());
        EQTriangle eqTriangle = new EQTriangle(3);
        System.out.println("The Perimeter for the EQTriangle is: " + eqTriangle.computePerimeter());
    }
}
