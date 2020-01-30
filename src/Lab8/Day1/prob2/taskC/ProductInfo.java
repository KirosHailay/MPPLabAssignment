package Lab8.Day1.prob2.taskC;


import Lab8.Day1.prob2.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductInfo {

   public  static enum SortMethod {BYPRICE, BYTITLE};

    public static void sort(List<Product> list, SortMethod sortMethod) {
        class ProductSort implements Comparator<Product> {

            @Override
            public int compare(Product o1, Product o2) {
                if (sortMethod == SortMethod.BYPRICE) {
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
                else {
                    return o1.getTitle().compareTo(o2.getTitle());
                }
            }

        }
        Collections.sort(list, new ProductSort());

    }

    public static void main(String [] args) {

    }
}
