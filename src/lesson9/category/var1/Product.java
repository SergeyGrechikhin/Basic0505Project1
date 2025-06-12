package lesson9.category.var1;

public class Product {
   private String name ;
   private Category category ;
   private String price ;
            private String quantity ;

    public Product(String name, Category category, String price, String quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }
            /*public Product(String name, String quantity, String price, String category) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    } */

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price='" + price + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
