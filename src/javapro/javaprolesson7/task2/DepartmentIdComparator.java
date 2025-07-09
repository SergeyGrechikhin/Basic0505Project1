package javapro.javaprolesson7.task2;

import java.util.Comparator;

public class DepartmentIdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        int result = e1.getDepartment().compareTo(e2.getDepartment());
        if (result == 0) {
            return Integer.compare(e1.getId(), e2.getId());
        }
        return result;
    }
}
