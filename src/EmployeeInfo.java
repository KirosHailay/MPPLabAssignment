import Lab7.prob1.partB.partC.Employee;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
    public void sort(List<Employee> emps, final Employee e) {
        Collections.sort(emps, ((e1,e2) -> {
//            e = new Employee("hello", 200);
            e.setSalary(1000);
            return e1.getName().compareTo(e1.getName());
        }));
    }
}
