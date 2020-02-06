package zfinalExampractice;

import Lesson10exercise.Pair;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee {
    String name;
    int salary;
    public Employee(String n, int s) {
        this.name = n;
        this.salary = s;
    }
    int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public boolean equals(Object o) {
        if(o == null)
            return false;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee)o;
        return employee.name.equals(this.name);
    }

    public boolean fEquals(Predicate<Employee> e){
       return this.equals(e);
    }
    public String toString() {
        return "Name: " + name + "Salary: " + salary;
    }
    public static void main(String [] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("kiros",1000));
        list.add(new Employee("kiros",2000));
        list.add(new Employee("Adam",4000));
        list.add(new Employee("Adam", 3000));
        Collections.sort(list, Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).reversed());

        System.out.println(list.toString());

        BiFunction<Integer,Integer,Integer> biFunction = (x,y)-> {
           return  2 * x - y;
        };

//        Predicate<Employee> employeePredicate = (x) -> x.equals(this
//        BiFunction viFunction = (int e, int z) -> {
//            return (int)e+z;
//        };
        System.out.println(biFunction.apply(4,5));
    }
}
