package basicjava.lesson10.task3;

public class Tasktype {
    String tasktype ;
    String taskdescription ;

    public Tasktype(String tasktype, String taskdescription) {
        this.tasktype = tasktype;
        this.taskdescription = taskdescription;
    }

    public String getTasktype() {
        return tasktype;
    }

    public String getTaskdescription() {
        return taskdescription;
    }

    @Override
    public String toString() {
        return "Tasktype{" +
                "tasktype='" + tasktype + '\'' +
                ", taskdescription='" + taskdescription + '\'' +
                '}';
    }
}
