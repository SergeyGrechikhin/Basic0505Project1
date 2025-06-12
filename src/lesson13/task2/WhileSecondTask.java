package lesson13.task2;

import java.util.Scanner;

public class WhileSecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько целых чисел вы хотите ввести ");
        int myint = scanner.nextInt() ;

        for (int i = 0; i < myint ; i++) {
            System.out.println("Введите ваше целое число");
            int myint2 = scanner.nextInt();

            if (myint2 > 0) {
                System.out.println("Ваше число " + myint2);
            } else {
                System.out.println("Число не целое ");
            }
            
        }


    }
}
