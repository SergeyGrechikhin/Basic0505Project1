package javapro.javaprolesson7.task2;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee dep1, Employee dep2) {
        return dep1.getDepartment().compareTo(dep2.getDepartment()) ;
    }
}
