package lab4.lab4C;

import java.time.LocalDate;


public class Order {

    private String orderNo;
    private LocalDate orderDate;
    private double orderAmount;

    public Order(String orderNo, LocalDate localDate, double orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = localDate;
        this.orderAmount = orderAmount;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public int getYear() {
        return orderDate.getYear();
    }

    public int getMonth() {
        return orderDate.getMonthValue();
    }
}
