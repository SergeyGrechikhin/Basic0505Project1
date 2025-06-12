package lesson12.task4var2;

public class Tovar {
    private String name ;
    private String price ;
    private String quantity ;

    public Tovar(String name, String price, String quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }
   /* public boolean comparename(Tovar anothertovar) {
        boolean compareResult =
                name.equals(anothertovar.getName()) ;
        return  compareResult ;

    } */

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}


