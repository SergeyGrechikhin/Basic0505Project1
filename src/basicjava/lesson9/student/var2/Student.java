package basicjava.lesson9.student.var2;

public class Student {
    private String name ;
    private String surname ;
            private String idcode ;
    private String gruppe ;

    public Student(String name, String surname, String idcode, String gruppe) {
        this.name = name;
        this.surname = surname;
        this.idcode = idcode;
        this.gruppe = gruppe;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", idcode='" + idcode + '\'' +
                ", gruppe='" + gruppe + '\'' +
                '}';
    }
}
