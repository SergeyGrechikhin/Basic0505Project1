package lesson8.task2;

public class Student {
    private String name;
    private String gruppe ;
    private boolean isstudeornot ;

    public void setIsstudeornot(boolean isstudeornot) {
        this.isstudeornot = isstudeornot;
    }

    public Student(String name, String gruppe, boolean isstudeornot) {
        this.name = name;
        this.gruppe = gruppe;
        this.isstudeornot = isstudeornot;
    }

    public String getName() {
        return name;
    }

    public String getGruppe() {
        return gruppe;
    }

    public boolean isIsstudeornot() {
        return isstudeornot;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gruppe='" + gruppe + '\'' +
                ", isstudeornot=" + isstudeornot +
                '}';
    }
}
