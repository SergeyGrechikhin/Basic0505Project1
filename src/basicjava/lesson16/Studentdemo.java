package basicjava.lesson16;

import java.util.Scanner;

public class Studentdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Введите сколько cтудентов вы хотите создать");
        int mystudentcounter = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[mystudentcounter] ;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Введите имя студента");
            String name = scanner.nextLine() ;

            Student student = new Student(name);
            students[i] = student ;

        }
        System.out.println("Введите какую букву хотите проверить");
        String mychar = scanner.nextLine();
        int counter = 0 ;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().startsWith(mychar)){
                counter++ ;
            }



        }

        System.out.println("Количество студентов чье имя начинается на   " +  mychar  +  " равна " + counter);
        for (int i = 0; i < students.length; i++) {

            System.out.println(" Имя студента " + (i + 1) + " : " + students[i].getName());

        }
    }


    }
















