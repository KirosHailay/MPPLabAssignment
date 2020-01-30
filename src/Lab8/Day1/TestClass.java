package Lab8.Day1;

import Lab8.Day1.prob2.taskA.PriceComparator;
import Lab8.Day1.prob2.taskC.ProductInfo;
import Lab8.Day1.prob2.Product;
import Lab8.Day1.prob2.taskB.TitleComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        
        
        // compare the product using the price attribute  Task A test
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("HP", 1000.00, 2019));
        productList.add(new Product("Toshiba", 2000.00, 2018));
        productList.add(new Product("Asus", 3000.00, 2022));
        productList.add(new Product("MAC", 4000.00, 2020));
        Collections.sort(productList, new PriceComparator());
        System.out.println("Compare the Product using Price Comparator Task A");
        System.out.println(productList);
        // compare the product using the title Task B test
        List<Product> productList1 = new ArrayList<>();

        productList1.add(new Product("HP", 1000.00, 2019));
        productList1.add(new Product("Toshiba", 2000.00, 2018));
        productList1.add(new Product("Asus", 3000.00, 2022));
        productList1.add(new Product("MAC", 4000.00, 2020));
        Collections.sort(productList1, new TitleComparator());

        System.out.println("Compare the Product using Title Comparator Task B");
        System.out.println(productList1);

        // Using closure property pre java 8 Task C test;
        ProductInfo.sort(productList, ProductInfo.SortMethod.BYPRICE);
        System.out.println(productList);
    }
}
