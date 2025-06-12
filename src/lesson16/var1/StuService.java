package lesson16.var1;

import lesson16.Student;

import java.util.Scanner;

public class StuService {
    public Stu[] createArray() {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Введите сколько cтудентов вы хотите создать");
        int mystudentcounter = scanner.nextInt();
        scanner.nextLine();
        Stu[] students = new Stu[mystudentcounter] ;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Введите имя студента");
            String name = scanner.nextLine() ;

            Stu student = new Stu(name);
            students[i] = student ;

        }
        System.out.println("Введите вашу букву. Если будут совпадение . Выйдет количество стундетов у которых имена начинается  на эту букву");
        String mychar = scanner.nextLine();
        int counter = 0 ;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().startsWith(mychar)){
                counter++ ;
            }



        }

        System.out.println("Количество студентов чье имя начинается на букву  " +  mychar  +  " равна " + counter);
        for (int i = 0; i < students.length; i++) {

            System.out.println(" Имя студента " + (i + 1) + " : " + students[i].getName());

        }
        return students;
    }
    }


