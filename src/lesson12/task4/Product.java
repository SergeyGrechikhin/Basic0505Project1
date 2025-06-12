package lesson12.task4;

public class Product {
 private String name ;
 private String price ;
 private String quntity ;

    public Product(String name, String quntity, String price) {
        this.name = name;
        this.quntity = quntity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getQuntity() {
        return quntity;
    }

    public String getPrice() {
        return price;
    }
    public void printproductInfo() {
        System.out.println("----------------");
        System.out.println("Информация о продукте: ");
        System.out.println(" Наименования  " + name);
        System.out.println(" Цена " + price);
        System.out.println("Количество " + quntity);
    }
    public boolean compareProductname(Product anotherProduct) {
        boolean compareResult =
                name.equals(anotherProduct.getName()) ;
        return  compareResult ;

    }




}
