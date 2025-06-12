package lesson9.student.var1;

import lesson8.task2.Student;

import java.util.Scanner;

public class Student1Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите данные о имени ");
        String myname = scanner.nextLine();
        System.out.println("Введите данные о фамилие ");
        String mysurname = scanner.nextLine();
        System.out.println("Введите данные о ID ");
        String myid = scanner.nextLine();
        System.out.println("Введите данные о группе ");
        String mygruppe = scanner.nextLine();
        Student1 studentnew1 = new Student1(myname, mysurname,myid,mygruppe) ;
        System.out.println(studentnew1);

        Scanner scanner1 = new Scanner(System.in) ;
        System.out.println("Введите данные о имени ");
        String myname1 = scanner1.nextLine();
        System.out.println("Введите данные о фамилие ");
        String mysurname1 = scanner1.nextLine();
        System.out.println("Введите данные о ID ");
        String myid1 = scanner1.nextLine();
        System.out.println("Введите данные о группе ");
        String mygruppe1 = scanner1.nextLine();
        Student1 studentnew2 = new Student1(myname1, mysurname1,myid1,mygruppe1) ;
        System.out.println(studentnew2);



    }


}
