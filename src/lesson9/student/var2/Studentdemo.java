package lesson9.student.var2;

public class Studentdemo {
    public static void main(String[] args) {
        StudentService studentService = new StudentService() ;
        Student student1 = studentService.studentcreate() ;
        System.out.println(student1);
        Student student2 = studentService.studentcreate() ;
        System.out.println(student2);
        Student student3 = studentService.studentcreate() ;
        System.out.println(student3);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
