package lab5.lab5_4.otherPackage;

import lab5.lab5_4.CustOrderFactory;
import lab5.lab5_4.Customer;


import java.time.LocalDate;

public class Main {
    public static void main(String [] args) {

//         we only use the factory method to create Customer
//        Customer customer = new Customer();
        Customer customer = CustOrderFactory.getCustomer("Rewina");
//         we can't create Order without customer
//        Order order  = new Order();
        customer.addOrder(LocalDate.now());

       System.out.println(customer.getName());
    }
}
