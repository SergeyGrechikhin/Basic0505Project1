package basicjava.lesson13.task1;

import java.util.Scanner;

public class WhileFirstTask {
    public static void main(String[] args) {

        boolean condition = true ;
        while (condition) {
            Scanner scanner = new Scanner(System.in) ;
            System.out.println("Введите целое четное , неотрицательное число");
            int myint = scanner.nextInt();

            if (myint >= 0 && myint % 2 == 0) {
                System.out.println("Ваше число");
                System.out.println(myint);
            } else {
                System.out.println("Число не целое четное или отрицательное");
                System.out.println("Завершаем программу ");
                System.out.println("Вы ввели " + myint + " поэтому вышла ошибка");
                condition = false ;

            }
        }

    }
}
