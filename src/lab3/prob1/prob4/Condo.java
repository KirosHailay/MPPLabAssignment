package lab3.prob1.prob4;

public class Condo extends  Properties{

    private  int numFloors;

    public Condo(int numFloors, String street, String city, String state, int zip ){

        super(street, city, state, zip);
        this.numFloors = numFloors;

    }

    @Override
    public double computeRent() {
        double rent = 400 * numFloors;
        super.setRent(rent);
        return rent;
    }
}
