package basicjava.lesson9.student.var1;

public class Student1 {
    String name ;
    String surname ;
    String idcode ;
    String gruppe ;

    public Student1(String name, String surname, String idcode, String gruppe) {
        this.name = name;
        this.surname = surname;
        this.idcode = idcode;
        this.gruppe = gruppe;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", idcode='" + idcode + '\'' +
                ", gruppe='" + gruppe + '\'' +
                '}';
    }
}
