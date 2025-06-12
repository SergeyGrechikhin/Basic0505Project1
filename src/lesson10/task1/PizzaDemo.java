package lesson10.task1;

public class PizzaDemo {
    public static void main(String[] args) {
        Pizzaservice pizzaservice = new Pizzaservice() ;
        Pizza mypizza = pizzaservice.createpizza() ;
        System.out.println(mypizza);
    }
}
