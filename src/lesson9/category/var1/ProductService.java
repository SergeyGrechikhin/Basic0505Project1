package lesson9.category.var1;

import java.util.Scanner;

public class ProductService {
    public Category createcategory(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите данные о типе продукта . "); //Ввод данных

        String typename = scanner.nextLine();

        System.out.println(" Введите данные о описание. ");

        String descriptioninfo = scanner.nextLine();

        Category category = new Category(typename,descriptioninfo) ;//Создание шаблона и возвращение результата
        return category ;


    }

    public Product createproduct(Category category) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" Введите данные о типе продукта . "); //Ввод данных

        String mynameproduct = scanner1.nextLine();

        System.out.println(" Введите данные о цене . ");

        String myprice = scanner1.nextLine();
        System.out.println("Введите данные о количестве ");
        String myquantity = scanner1.nextLine();



        Product newProduct = new Product(mynameproduct,category,myprice,myquantity) ;//Создание шаблона и возвращение результата
        return newProduct ;

    }



}
