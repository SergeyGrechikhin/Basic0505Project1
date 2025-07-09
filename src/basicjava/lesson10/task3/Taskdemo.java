package basicjava.lesson10.task3;

public class Taskdemo {
    public static void main(String[] args) {
        TaskService1 taskService1 = new TaskService1();
        Tasktype tasktype = taskService1.createtasktype() ;
        Task task = taskService1.createtask(tasktype) ;
        System.out.println(task);

    }

}
