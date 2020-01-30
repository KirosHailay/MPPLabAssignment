package Lab8.Day1.prob2.taskB;

import Lab8.Day1.prob2.Product;

import java.util.Comparator;

public class TitleComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
