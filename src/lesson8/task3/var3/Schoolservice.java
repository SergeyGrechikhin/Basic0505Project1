package lesson8.task3.var3;

import lesson8.task2.Student;

import java.util.Scanner;

public class Schoolservice {
    public void changestudentstatus(School school) {  //создал класс , дал имя и  возможность обработки данных
        System.out.println("Введите новые данные о студенте "); // сообщения для пользователя
        Scanner sc = new Scanner(System.in) ; //создал сканер
        String newstatus = sc.nextLine() ;  //новая переменная которая равна что ввел пользаватель
        school.setStatus(newstatus); //из Set взял информацию и внес в нее данные что ввел пользователь
        sc.close();

    }
}
