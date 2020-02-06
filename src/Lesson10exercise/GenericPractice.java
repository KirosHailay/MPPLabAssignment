package Lesson10exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GenericPractice<T> {
    public static <T extends Comparable<T>>  T max1(List<T> list){
        T max = list.get(0);

        for (T t: list) {
            if(t.compareTo(max) > 0)
                max = t;
        }
        return max;
    }


















    public static <T> T[] toArray(Collection<T> coll) {

        // Componet type is not allowed to be type Variable

//        T[] arr = new T[coll.size()]; //compiler error
        T[] arr = (T[]) new Object[5];
        int k = 0;
        for(T element : coll)
            arr[k++] = element;
        return arr;
    }

    public static void main(String [] args) {
        List words = new ArrayList();
        words.add("Hello");
        words.add("word");
        Employee e = new Employee(); // raw type
        Employee<String, Integer> employee = new Employee<>(); // parametrized type /String is type argument
        String s = (String) words.get(0) + (String) words.get(1);
        System.out.println(s);

        // Componet type array is not allowed to be parameterized type
        List<Pair>[] arr = null;
//        arr = new ArrayList<Pair>()[4];
        SimplePair<Integer, String> pair = new SimplePair<>(1, "Kiros");
        SimplePair<Integer, String> pair2 = new SimplePair<>(2, "Liak");
        List<SimplePair> list = new ArrayList<>();
        list.add(pair);
        list.add(pair2);

//        max1(list)
        boolean value = compares(pair, pair2);
        System.out.println("Are they equal: "+value);

        args = new String[]{"CA", "US", "MX", "HN", "GT"};
        print(args);
        Integer[] x = new Integer[]{10,20,30,40,50};
        print(x);

      System.out.println("The occurrence is" + countOccurrences(args, null));
        // extends
        // is you get value from the list but you can't add
        List<? extends Number> list1 = new ArrayList<Integer>();
//        list.add(4);
        // you can insert but you can't get
        // you have to cast in order to access it
        List<? super Integer> test = new ArrayList<>();
        test.add(5);
//        Object o = new O
//        test.add("");

//        Integer t = test.get(0);

        List<Integer> ints1 = new ArrayList<>();
        count(ints1, 5);

        System.out.println("hello" + ints1);
        List<Integer> ints = Arrays.asList(1, 2, 3);
        Double val = sum(ints); //output: 6.0
        System.out.println("Value: " + val);
        List<Double> doubles = Arrays.asList(2.78, 3.14);
        Double val2 = sum(doubles);
        System.out.println("Value2: " + val2);
    }
    public static double sum(Collection<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void count(Collection<? super Integer> ints, int n) {
        for(int i = 0; i < n; ++i) {
            ints.add(i);
        }
    }
    public static <K,V> boolean compares(SimplePair<K,V> simplePair, SimplePair<K,V> simplePair2) {
        return simplePair.getKey().equals(simplePair.getKey()) && simplePair.getValue().equals(simplePair2.getValue());
    }

    public static<T> void print(T[] t) {
        for (T t1: t) {
            System.out.printf("%s", t1);
        }
        System.out.println();

    }

    public static <T> int countOccurrences(T[] arr, T t) {

        // imperative way
        int count = 0;
        if(t==null) {
            for (T t1: arr) {
                if (t1 == null)
                    count++;
            }
        }

        else {
            for (T t1: arr) {
                if (t1.equals(t))
                    count++;
            }
        }
        return count;


//         Declarative way

//        return Stream.of(arr).filter(v-> v.equals(t)).count();
    }



}
