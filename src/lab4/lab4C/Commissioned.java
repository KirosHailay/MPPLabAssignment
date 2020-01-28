package lab4.lab4C;

import java.util.List;

public class Commissioned extends Employee {

    private double commission;
    private double baseSalary;
    List<Order> orderList;

    public Commissioned(String empId, double commission, double baseSalary, List<Order> orders) {
        super(empId);
        orderList = orders;
        this.commission = commission;
        this.baseSalary = baseSalary;
    }
    @Override
    public double calGrossPay(int month, int year) {

        // we have to check if the given month is january
        // we have to change it to the previous year and december
        int previousMonth = month-1;
        int previousYear = year;

        if (previousMonth == 0) {
            previousMonth = 12;
            previousYear = year -1;
        }

        double sum = 0.0;
        double total = 0.0;
        for (Order o: orderList) {
            System.out.println("O.getMonth(" + o.getMonth());
            if ((o.getMonth() == previousMonth) && (o.getYear() == previousYear)) {
                total += o.getOrderAmount();
                System.out.println("Hello");
            }
        }
        total = total * commission;
        sum = baseSalary + total;
        return sum;
    }
}
