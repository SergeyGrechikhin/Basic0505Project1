package lesson10.task1;

public class Pizza {
    private double pizza1 ;


    public Pizza(double pizza1) {
        this.pizza1 = pizza1;

    }

    public double getPizza1() {
        return pizza1;
    }



    @Override
    public String toString() {
        return "Pizza{" +
                "pizza1=" + pizza1 +
                '}';
    }
}
