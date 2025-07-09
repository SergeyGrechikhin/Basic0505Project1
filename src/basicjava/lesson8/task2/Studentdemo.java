package basicjava.lesson8.task2;

import java.util.Scanner;

public class Studentdemo {
    public static void main(String[] args) {

        //Первый способ
        System.out.println("------------------------");
        System.out.println("Первый способ");
        System.out.println("----------------------------");


        Scanner scanner = new Scanner(System.in) ;
        System.out.println(" Введите данные о студенте ");
        System.out.println("Введите данные о  имене студента : ");
        String name = scanner.nextLine() ;
        System.out.println("Введите данные о группе студента : ");
        String gruppe = scanner.nextLine();
        System.out.println("Введите данные о статусе студента : ");
        boolean isstudyornot = scanner.nextBoolean() ;
        //статус студента
        boolean isstudyornot1 = isstudyornot ;



        Student student = new Student(name,gruppe,isstudyornot1) ;
        System.out.println(student);
        System.out.println("Имя студента : " + name + "Группа студента : " + "Статус студента : " + isstudyornot1 );



        //второй способ
        System.out.println("-----------------------------");
        System.out.println("Второй способ");
        System.out.println("-----------------------------");
        Student student1 = new Student("Алексей" , "0506007",true ) ; //Ввожу данные как обычно
        System.out.println(student1); // Распечатываю мои данные
        Scanner scanner1 = new Scanner(System.in) ; //Создаю сканер
        System.out.println(" Введите новые данные о статусе студента : "); //Сообщения для пользователя
        boolean infostudent = scanner1.nextBoolean() ; //Создаю переменную которую равна тому что ввел пользователь
        student1.setIsstudeornot(infostudent); //Через Класс Student взял информацию из setIsstudeornot в скобки внес данные переменной которую введет пользователь .
        //student1.setIsstudeornot = private boolean isstudeornot .
        System.out.println(student1);
















    }
}






//private String name;
//    private String gruppe ;
//    private boolean isstudeornot ;