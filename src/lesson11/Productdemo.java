package lesson11;

import java.util.Scanner;

public class Productdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println(" Введите ваше имя ");
        String myname = scanner.nextLine();
        System.out.println("Введите вашу цену");
        int myprice = scanner.nextInt();


        if (myname.isBlank()  ) {
            System.out.println("Невозможно создать новый продукт с таким названием .");
        } else if (myprice <= 0) {
            System.out.println("Невозможно создать новый продукт с ценой меньше или равной нулю");
        } else {
            Product11 product = new Product11(myname,myprice);
            System.out.println(product);
        }

    }
}
