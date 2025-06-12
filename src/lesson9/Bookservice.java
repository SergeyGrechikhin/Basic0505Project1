package lesson9;

import java.util.Scanner;

public class Bookservice { //Сервисная часть
    public Book bookgenerate() { // Метод создание книги
        Scanner scanner = new Scanner(System.in) ;

        System.out.println(" Введите данные о имени . "); //Ввод данных

        String bookname = scanner.nextLine();

        System.out.println(" Введите данные о авторе . ");

        String bookproducer = scanner.nextLine();

        Book newbook = new Book(bookname,bookproducer) ;//Создание шаблона и возвращение результата
        return newbook ;

    }
}
