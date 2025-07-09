package basicjava.lesson10.task3;

public class Task {
  private  String taskid;
   private Tasktype taskdescription;

    public Task(String taskid, Tasktype taskdescription) {
        this.taskid = taskid;
        this.taskdescription = taskdescription;
    }

    public String getTaskid() {
        return taskid;
    }

    public Tasktype getTaskdescription() {
        return taskdescription;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskid='" + taskid + '\'' +
                ", taskdescription=" + taskdescription +
                '}';
    }
}
