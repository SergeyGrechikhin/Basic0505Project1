package basicjava.lesson9.student.var2;

import java.util.Scanner;

public class StudentService {
    public Student studentcreate () {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите данные о имени ");
        String myname = scanner.nextLine();
        System.out.println("Введите данные о фамилие ");
        String mysurname = scanner.nextLine();
        System.out.println("Введите данные о ID ");
        String myid = scanner.nextLine();
        System.out.println("Введите данные о группе ");
        String mygruppe = scanner.nextLine();

        Student newstudent = new Student(myname,mysurname,myid,mygruppe);
        return newstudent ;
    }
}
