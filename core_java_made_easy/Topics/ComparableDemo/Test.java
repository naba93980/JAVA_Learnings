package ComparableDemo;

import java.util.Set;
import java.util.TreeSet;

import ComparatorDemo.NameComparator;

public class Test {
    public static void main(String[] args) {
        // Set<Employee>s=new TreeSet<>();
        Set<Employee>s=new TreeSet<>(new NameComparator());
        s.add(new Employee(45, "naba"));
        s.add(new Employee(65, "modak"));
        s.add(new Employee(5, "bob"));
        s.add(new Employee(85, "john"));
        s.add(new Employee(55, "alice"));    
        for (Employee employee : s) {
            System.out.println(employee.name);
        }
    }
}
