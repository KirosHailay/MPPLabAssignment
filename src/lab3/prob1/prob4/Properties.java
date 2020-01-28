package lab3.prob1.prob4;

public abstract class Properties {
    private Address address;
    private double rent;
    public Properties(String street, String city, String state, int zip) {
        address = new Address(street, city, state, zip);
    }
    abstract double computeRent();

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getRent() {
        return rent;
    }

}
