package lesson10.task2;

import java.util.Scanner;

public class Taskservice {
    public Mytask createtask () {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Привет давай создадим задачи на день чтобы подготовиться к учебной лекции ");
        System.out.println("Первая задача");

        String bed = scanner.nextLine();
        System.out.println(" Вторая задача ");
        String wash = scanner.nextLine();
        System.out.println(" Третья задача ");
        String study = scanner.nextLine();
        System.out.println(" Твой список дел ");
        System.out.println(bed);
        System.out.println(wash);
        System.out.println(study);

        Mytask mytask = new Mytask(bed,study,wash) ;
        return mytask ;

    }
    public Task createtaskname(Mytask mytask) {
        Scanner scanner1 = new Scanner(System.in) ;
        System.out.println(" Задайте задачу главную задачу на сегодня ");
        String mytaskname = scanner1.nextLine();

        Task task = new Task (mytaskname,mytask) ;
        return task ;

    }


}
