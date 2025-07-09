package basicjava.lesson12.task3var2;

import java.util.Scanner;

public class MydayIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите номер дня недели по счету от 1 до 7 !");
        int mydaywithif = scanner.nextInt() ;

        if ( mydaywithif == 1 ) {
            System.out.println("Ваш день понедельник");
        } else if (mydaywithif == 2) {
            System.out.println("Ваш день вторник") ;
        } else if (mydaywithif == 3){
            System.out.println("Ваш день среда");
        } else if (mydaywithif == 4) {
            System.out.println("Ваш день четверг");
        } else if (mydaywithif == 5) {
            System.out.println("Ваш день пятница");
        } else if (mydaywithif == 6) {
            System.out.println("Ваш день суббота");
        } else if (mydaywithif == 7) {
            System.out.println("Ваш день воскресенье");
        } else {
            System.out.println("Все числа равны");



        }

    }

}
