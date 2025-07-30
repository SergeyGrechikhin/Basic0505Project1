package javapro.lesson13.repository;

import javapro.lesson13.entity.Book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BookRepository {
    private final Map<String, Book> books = new HashMap<>();

    public void save(Book book) {
        books.put(book.getIsbn(),  book);
    }

    public Book findByIsbn(String isbn) {
        return books.get(isbn);
    }


    public boolean existsByIsbn(String isbn  ) {
        return books.containsKey(isbn  );
    }

    public Collection<Book> findAll() {
        return books.values();
    }

    public void deleteEmployee(String isbn) {
        books.remove(isbn);
    }
}
