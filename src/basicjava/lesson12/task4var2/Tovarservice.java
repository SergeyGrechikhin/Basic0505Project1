package basicjava.lesson12.task4var2;

import java.util.Scanner;

public class Tovarservice {
    public static Tovar createnewtovar(Scanner scanner) {
        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();
        System.out.println("Введите вашу цену");
        String price = scanner.nextLine();
        System.out.println("Введите ваше количество");
        String quantity = scanner.nextLine();
        Tovar tovar = new Tovar(name,price,quantity);
        System.out.println("Ваш товар : " + name);
        System.out.println("Ваша цена : " + price);
        System.out.println("Ваше количество : " + quantity);
        System.out.println("Введите ваше имя");
        System.out.println("Имя не должно повторяться ");
        String name1 = scanner.nextLine();
        if (name.equals(name1)) {
            System.out.println("Товар с таким именем сущесвует");
            return tovar ;
        } else {System.out.println("Введите вашу цену");
            String price1 = scanner.nextLine();
            System.out.println("Введите ваше количество");
            String quantity1 = scanner.nextLine();
            Tovar tovar1 = new Tovar(name1,price1,quantity1);
            System.out.println(tovar);
            System.out.println("-------------------");
            System.out.println(tovar1);

            return tovar1;
        }

    }



}
