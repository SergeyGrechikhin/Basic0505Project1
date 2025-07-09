package basicjava.lesson12.task4;

import java.util.Scanner;

public class Productservice {
    public Product createProduct(String product){

        System.out.println(product);
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите ваше название товара");
        String myname = scanner.nextLine() ;
        System.out.println("Введите вашу цену");
        String myprice = scanner.nextLine() ;
        System.out.println("Введите ваше количество");
        String myquantity = scanner.nextLine() ;


        return new Product(myname,myquantity,myprice);

    }
}
