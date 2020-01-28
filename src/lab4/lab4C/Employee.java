package lab4.lab4C;

public abstract class Employee {
    private String empId;

    public Employee(String empId) {
        this.empId = empId;
    }
    public void print(int month, int year) {
        System.out.println("Employee Id: "+ empId);
        calcCompensation(month, year).print();

    }

    public Paycheck calcCompensation(int month, int year){
        double grossPay  = calGrossPay(month, year);

        return new Paycheck(grossPay, 0.23, 0.05, 0.01, 0.03, 0.075);

    }
    public double getPaycheck(int month, int year) {
      return   calcCompensation(month, year).getNetPay();
    }

    public abstract double calGrossPay(int month, int year);
}
