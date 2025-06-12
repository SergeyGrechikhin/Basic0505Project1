package lesson10.task2;

public class Taskdemo {
    public static void main(String[] args) {
        Taskservice taskservice = new Taskservice();

        Mytask mytask1 = taskservice.createtask();
        Task mytaskname1 = taskservice.createtaskname(mytask1);

        System.out.println(mytaskname1);
    }
}
