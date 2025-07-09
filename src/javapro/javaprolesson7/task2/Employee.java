package javapro.javaprolesson7.task2;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String department, double salary, String name) {
        this.id = id;
        this.department = department;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
