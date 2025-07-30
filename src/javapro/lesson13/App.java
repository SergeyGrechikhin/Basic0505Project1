package javapro.lesson13;

import javapro.lesson13.repository.AuthorRepository;
import javapro.lesson13.repository.BookRepository;
import javapro.lesson13.service.AuthorService;
import javapro.lesson13.service.BookService;
import javapro.lesson13.ui.LibraryUI;

public class App {
    public static void main(String[] args) {
        AuthorRepository authorRepository = new AuthorRepository();
        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);
        AuthorService authorService = new AuthorService(authorRepository, bookService);
        LibraryUI libraryUI = new LibraryUI(authorService, bookService);
        libraryUI.menu();
    }


}
