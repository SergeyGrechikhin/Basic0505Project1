package basicjava.lesson12.task4;

public class Productdemo {
    public static void main(String[] args) {
        Productservice productservice = new Productservice() ;
       Product product1 = productservice.createProduct("Введите данные о продукте") ;
        Product product2 = productservice.createProduct("Введите данные о продукте") ;

        if (product1.compareProductname(product2)) {
            System.out.println("Продукт c таким название существует");
        }



    }


}
