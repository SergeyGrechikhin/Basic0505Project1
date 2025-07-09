package basicjava.lesson16.var1;

public class Studemo {
    public static void main(String[] args) {
        StuService stuService = new StuService() ;
        Stu[] stus = stuService.createArray();
    }
}
