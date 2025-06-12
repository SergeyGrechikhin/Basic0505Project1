package lesson12.task2;

import java.util.Scanner;

public class MytaskwithInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Дай своё первое число ! " );
        int myfirstint = scanner.nextInt();
        System.out.println(" Дай своё второй число ! ");
        int mysecondint = scanner.nextInt();

        System.out.println(" Дай своё третье число ! ");
        int mythirdint = scanner.nextInt();

        if (myfirstint > mysecondint && myfirstint > mythirdint  ) {
            System.out.println("Первое число максимальное");
        } else if (mysecondint > myfirstint && mysecondint > mythirdint) {
            System.out.println("Второе число  максильное ");
        } else if (mythirdint > myfirstint && mythirdint > mysecondint){
            System.out.println("Третье число максимальное");
        } else {
            System.out.println("Все числа равны");

        }
    }
}
