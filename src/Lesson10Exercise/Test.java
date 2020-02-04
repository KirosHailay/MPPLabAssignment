package Lesson10Exercise;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main (String [] args) {
        List<? extends Employee> list = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();
        List<Manager> list2 = new ArrayList<>();
//        list = list2;
        employeeList.addAll(list2);
        // ? extend Class  you can't add value except null but you can get value
        // ? super extend you can add but you can't retreive value


    }
}
