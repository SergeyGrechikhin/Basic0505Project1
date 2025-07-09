package basicjava.lesson9.category.var1;

public class Productdemo {
    public static void main(String[] args) {
        ProductService productService = new ProductService() ;
        Category category = productService.createcategory() ;
        Product myproduct = productService.createproduct(category) ;
        System.out.println(myproduct);
        Category category2 = productService.createcategory() ;
        Product myproduct2 = productService.createproduct(category2) ;
        System.out.println(myproduct2);
        Category category3 = productService.createcategory() ;
        Product myproduct3 = productService.createproduct(category3) ;
        System.out.println(myproduct3);


    }
}
