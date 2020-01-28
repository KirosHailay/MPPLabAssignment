package lab3.prob1.prob2;


import java.util.ArrayList;
import java.util.List;

public class Building {

    double maintanceCost;
    List<Apartment> apartmentList;
    public Building(double maintanceCost, double rent) {
        this.maintanceCost = maintanceCost;
        apartmentList = new ArrayList<Apartment>();
        apartmentList.add(new Apartment(rent, this));
    }

    public double generateProfit() {
        double sum = 0;
        for (Apartment apartment : apartmentList) {
            sum += apartment.getRent();
        }
        return sum -maintanceCost;
    }

    public Apartment addApartment(double rent) {
        Apartment apartment = new Apartment(rent, this);
        apartmentList.add(apartment);
        return apartment;
    }
}
