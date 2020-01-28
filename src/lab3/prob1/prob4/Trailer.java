package lab3.prob1.prob4;

public class Trailer extends Properties {


    private Address address;

    public Trailer( String street, String city, String state, int zip ){
        super(street, city, state, zip);

    }

    public double computeRent() {
        super.setRent(500);
        return super.getRent();
    }
}

