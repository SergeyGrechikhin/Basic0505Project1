package basicjava.lesson8.task3.var3;

public class Schooldemo {
    public static void main(String[] args) {
     Schoolservice newstatusschool = new Schoolservice(); //вызвал сервисный центр

        School namestatusschool = new School("Василий","171819","Учиться"); //задал данные
        System.out.println(namestatusschool); //вывод инфо

        newstatusschool.changestudentstatus(namestatusschool); //из сервисного центра , я вывел метод и вставил в него данные класс которые я задал
        System.out.println(namestatusschool);



    }
}
