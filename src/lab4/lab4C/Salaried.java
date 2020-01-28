package lab4.lab4C;

public class Salaried extends Employee {

    private  double salary;

    public Salaried(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    @Override
    public double calGrossPay(int month, int year) {
        return salary;
    }


}
