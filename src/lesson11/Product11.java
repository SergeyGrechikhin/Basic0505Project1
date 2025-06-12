package lesson11;

public class Product11 {
  private  String name ;
       private     int price ;

    public Product11(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product11{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
