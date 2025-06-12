package lesson5.tasklesson;

public class RD {
    public static void main(String[] args) {
        R robot1 = new R();
        robot1.name = "Stas" ;
        robot1.x =  10;
        robot1.y =  2 ;

        robot1.hi();

                robot1.hi2();
        System.out.println("Вывод 1 сложение : " + robot1.result);


        robot1.hi3() ;
        System.out.println("Вывод 2 умножение : " + robot1.result);




    }
}
