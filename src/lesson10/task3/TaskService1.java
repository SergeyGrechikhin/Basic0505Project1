package lesson10.task3;

import java.util.Scanner;

public class TaskService1 {
    public Tasktype createtasktype() {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите тип задачи");
        String mytype = scanner.nextLine() ;
        System.out.println("Введите описание задачи");
        String mydescription = scanner.nextLine() ;
        Tasktype tasktype = new Tasktype(mytype,mydescription) ;
        return tasktype;

    }
    public Task createtask (Tasktype tasktype) {
        Scanner scanner1 = new Scanner(System.in) ;
        System.out.println("Введите id задачи");
        String myid = scanner1.nextLine() ;
        ;
        Task task = new Task(myid,tasktype) ;
        return task;



    }

}

