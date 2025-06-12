package lesson10.task1;

import java.util.Scanner;

public class Pizzaservice {
    public Pizza createpizza (){
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Есть пицца диаметра 24 и 28 .Введите какую пиццу вы будете покупать");
        double pizza1 = scanner.nextDouble() ;
        System.out.println("Подсчет калорий");
        double pizza2 = pizza1 * 40 ;


        double pizza24 = 24 * 40 ;
        System.out.println(" Каллории пиццы 24см : " + pizza24);
                double pizza28 = 28 * 40 ;
        System.out.println(" Каллории пиццы 28см : " + pizza28);
        System.out.println("Ваши Каллории : " + pizza2);

        double pizzasumme = pizza28 - pizza24 ;
        System.out.println(" Излишки Каллорий при покупки пиццы 28 см : " + pizzasumme);



        Pizza pizza = new Pizza(pizza2) ;
        return pizza ;


        }

}
