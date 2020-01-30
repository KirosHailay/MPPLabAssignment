package Lab8.Day2.prob1.prob2;

import java.util.function.Supplier;

public class MathRandom {

    public static void main(String[] args) {
        Supplier<Double> supplier = Math::random;
        double value1 = supplier.get();
        // out put the result
        System.out.println("The Random number value1 is: "+value1);

        // Re Write the above in lambda expression
        Supplier<Double> supplier1 = () -> {
           return Math.random();
        };

        // out put the result
        double value2 = supplier.get();
        System.out.println("The Random number value2 is: "+value2);

        // using the inner class printing the random number to console
      MathRandom.SupplierImplementer supplierImplementer = new MathRandom().new SupplierImplementer();
      System.out.println("The Random number value3 is: "+ supplierImplementer.get());
    }

    class SupplierImplementer implements Supplier<Double> {


        @Override
        public Double get() {
            return Math.random();
        }
    }
}
