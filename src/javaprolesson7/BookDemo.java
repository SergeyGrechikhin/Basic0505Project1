package javaprolesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("book3",1975,BookAuthor.AUTHOR4));
        books.add(new Book("book2",2001,BookAuthor.AUTHOR3));
        books.add(new Book("book1",2000,BookAuthor.AUTHOR2));
        books.add(new Book("book4",1955,BookAuthor.AUTHOR1));

        System.out.println("Collection sort by name");
        Collections.sort(books);
        books.forEach(System.out::println);
        System.out.println("Collection sort by Author");
        books.sort(new AuthorComparator());
        books.forEach(System.out::println);
        System.out.println("Collection sort by  Year");
        books.sort(new YearComporator());
        books.forEach(System.out::println);

    }
}
