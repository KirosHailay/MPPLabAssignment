package Lab8.Day1.prob2.taskD;

import Lab8.Day1.prob2.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaImplementation {
    public static void main(String [] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("HP", 1000.00, 2019));
        productList.add(new Product("HP", 2000.00, 2018));
        productList.add(new Product("Asus", 3000.00, 2022));
        productList.add(new Product("MAC", 4000.00, 2020));
        Collections.sort(productList, (p1,p2) -> {
            if (p1.getTitle().compareTo(p2.getTitle())!=0)
                return p1.getTitle().compareTo(p2.getTitle());
            else {
                if (p1.getModel() < p2.getModel())
                    return -1;
                else if (p1.getModel() > p2.getModel()) {
                    return 1;
                }
                else return 0;
            }
        });
        System.out.println(productList);
    }
}
