package lab3.prob1.prob2;

public class Main {
    public static void main(String [] args) {
        LandLord landLord = new LandLord("VarilHall", 4000, 2000);
        landLord.buildingList.get(0).addApartment(3000);
        landLord.buildingList.get(0).addApartment(4000);

        System.out.println(landLord.getTotalProfit());

    }
}
