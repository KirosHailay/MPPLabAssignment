package lab5.lab5_4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;
     Customer(String name) {
        this.name = name;
        orders = new ArrayList<Order>();
    }
    public Order addOrder(LocalDate dateOfOrder) {
        Order ord = new Order(dateOfOrder);
        orders.add(ord);
        return ord;
    }
    public String getName() {
        return name;
    }
    public List<Order> getOrders() {
        return orders;
    }

}
