package lab3.prob1.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandLord {

    private String name;
    List<Building> buildingList;

    public LandLord(String name, double mainingCost, double rent) {
        this.name = name;
        buildingList  = new ArrayList<>();
        buildingList.add(new Building(mainingCost, rent));
    }

    public void addBuilding(double maintingCost, double rent) {
        buildingList.add(new Building(maintingCost,rent));
    }

    public double getTotalProfit() {
        double sum = 0;
        for (Building building : buildingList) {
            sum += building.generateProfit();
        }
        return sum;
    }

}
