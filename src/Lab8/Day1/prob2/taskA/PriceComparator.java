package Lab8.Day1.prob2.taskA;

import Lab8.Day1.prob2.Product;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() < o2.getPrice()) {
            return -1;
        }
        else if (o1.getPrice() > o2.getPrice()) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
