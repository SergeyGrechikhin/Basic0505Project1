package basicjava.lesson10.task2;

public class Task {
   private String task ;
   private Mytask taskdescription ;

    public Task(String task, Mytask taskdescription) {
        this.task = task;
        this.taskdescription = taskdescription;
    }

    public String getTask() {
        return task;
    }

    public Mytask getTaskdescription() {
        return taskdescription;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task='" + task + '\'' +
                ", taskdescription=" + taskdescription +
                '}';
    }
}
