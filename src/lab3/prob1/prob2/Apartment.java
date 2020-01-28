package lab3.prob1.prob2;

public class Apartment {

    private double rent;
    private Building building;

     Apartment(double rent, Building building) {
        this.rent = rent;
        this.building = building;
    }

    public double getRent() {
        return rent;
    }

    public Building getBuilding(){
         return building;
    }
}
