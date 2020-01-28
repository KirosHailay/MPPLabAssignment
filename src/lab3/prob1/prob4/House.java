package lab3.prob1.prob4;

public class House extends  Properties{

    private double lotSize;


    public House(double lotSize, String street, String city, String state, int zip ){
        super (street, city, state, zip);
        this.lotSize = lotSize;


    }

    public double computeRent() {
       double  rent = 0.1 * lotSize;
       super.setRent(rent);
        return rent;
    }

}
