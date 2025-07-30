package javapro.lesson13.service;

import javapro.javaprolesson7.task2.Employee;
import javapro.lesson13.dto.ResponceDTO;
import javapro.lesson13.entity.Book;
import javapro.lesson13.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
   private BookRepository bookRepository = new BookRepository();

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public ResponceDTO<Book> create(String isbn, String description, String title) {
        if (bookRepository.existsByIsbn(isbn)) {
            return ResponceDTO.requestFalse(null,"Book with this isbn already exists");
        }
        Book book = new Book(isbn, description, title);
        bookRepository.save(book);
        return ResponceDTO.requestTrue(book,"Book successfully created");
    }

    public List<Book> findAll() {
        return new ArrayList<>(bookRepository.findAll());
    }

    public Book findByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }



    public ResponceDTO findByIsbnUser(String isbn){
        List<Book> list = bookRepository.findAll().stream().filter(b -> b.getIsbn().equalsIgnoreCase(isbn)).collect(Collectors.toList());
        if(list.isEmpty()){
            return  ResponceDTO.requestFalse(null,"Books not found") ;
        }
        return ResponceDTO.requestTrue(list,"Books successfully found");
    }

    public ResponceDTO findByTitle(String title){
        List<Book> list = bookRepository.findAll().stream().filter(t -> t.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
        if(list.isEmpty()){
            return ResponceDTO.requestFalse(null,"Book not found") ;
        }
        return  ResponceDTO.requestTrue(list,"Book successfully found");
    }

    public ResponceDTO deleteByIsbn(String isbn){
        if (!bookRepository.existsByIsbn(isbn)) {
            return ResponceDTO.requestFalse(null,"Book with this id does not exist");
        }
        bookRepository.deleteEmployee(isbn);
        return  ResponceDTO.requestTrue(isbn,"Book successfully deleted");
    }






}
