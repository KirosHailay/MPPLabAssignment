package lab4.lab4C;

public class Hourly extends  Employee {

    private double hourlyWage;
    private double hoursPerWeek;

    public Hourly(String empId, double hourlyWage, double hoursPerWeek) {
        super(empId);
        this.hoursPerWeek = hoursPerWeek;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double calGrossPay(int month, int year) {
        return hourlyWage * (4 * hoursPerWeek);
    }

}
