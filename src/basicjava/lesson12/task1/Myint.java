package basicjava.lesson12.task1;

import java.util.Scanner;

public class Myint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Дай свое первое число ! " );
        int myfirstint = scanner.nextInt();
        System.out.println(" Дай второй число ! ");
        int mysecondint = scanner.nextInt();

        if (myfirstint < mysecondint ) {
            System.out.println("Второе число больше первого");
        } else if (myfirstint > mysecondint) {
            System.out.println("Первое число больше второго ");
        } else {
            System.out.println("Оба числа равны");
        }


}


}
