package lab5.lab5_4;

public class CustOrderFactory {
    private CustOrderFactory() {};

    public static Customer getCustomer(String name) {
        return new Customer(name);
    }
}
