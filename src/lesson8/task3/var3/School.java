package lesson8.task3.var3;

public class School {
    private String studentName;
    private String group;
    private String status;

    public School(String studentName, String group, String status) {
        this.studentName = studentName;
        this.group = group;
        this.status = status;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getGroup() {
        return group;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "School{" +
                "studentName='" + studentName + '\'' +
                ", group='" + group + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
