package javapro.javaprolesson7.task2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1,"Department1",9000,"Oleg"));
        employees.add(new Employee(4,"Department4",5000,"Max"));
        employees.add(new Employee(2,"Department2",3000,"Victor"));
        employees.add(new Employee(3,"Department3",2000,"Petr"));

        System.out.println("Sort by Id");
        employees.sort(new IdComparator());
        employees.forEach(System.out::println);
        System.out.println("Sort by Department and ID");
        employees.sort(new DepartmentIdComparator());
        employees.forEach(System.out::println);
        System.out.println("Sort by salary");
        employees.sort(new SalaryComparator());
        employees.forEach(System.out::println);
        System.out.println("Sort by Department and Name");
        employees.sort(new DepartmentNameComparator());
        employees.forEach(System.out::println);
        System.out.println("Sort  by Department ");
        employees.sort(new DepartmentComparator());
        employees.forEach(System.out::println);
        System.out.println("Sort  by Name");
        employees.sort(new NameComparator());
        employees.forEach(System.out::println);
    }
}
