package javapro.lesson13.service;

import javapro.lesson13.dto.ResponceDTO;
import javapro.lesson13.entity.Author;
import javapro.lesson13.entity.Book;
import javapro.lesson13.repository.AuthorRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AuthorService {
 private final AuthorRepository authorRepository;
 private final BookService bookService ;

    public AuthorService(AuthorRepository authorRepository, BookService bookService) {
        this.authorRepository = authorRepository;
        this.bookService = bookService;
    }

    public Author funcByTransferIsbn(String id) {
        return authorRepository.findAll().stream().filter(a -> a.getId().equals(id)).findFirst().orElse(null);
    }



    public ResponceDTO<Author> createAuthor(String id,  String info, String authorName) {
        if (authorRepository.exists(id)) {
            return ResponceDTO.requestFalse(null,"Author with this id already exists") ;
        }
        if (authorRepository.existsByName(authorName)) {
            return ResponceDTO.requestFalse(null,"Author with this name already exists") ;
        }
        Author author = new Author(id,  info, authorName);
        authorRepository.save(author);
        return ResponceDTO.requestTrue(null,"Author created successfully");
    }

    public ResponceDTO<?> addBookToAuthor(String isbn, String idAuthor) {
        Book books = bookService.findByIsbn(isbn);
        if (books == null) {
            return ResponceDTO.requestFalse(null,"Book not found") ;
        }
        Author author = funcByTransferIsbn(idAuthor);
        if (author == null) {
            return ResponceDTO.requestFalse(null,"Author not found");
        }
        author.addBook(books);

        return  ResponceDTO.requestTrue(null,"Book added successfully");
    }
    public List<Author> getAllAuthors() {
        return new ArrayList<>(authorRepository.findAll());
    }

    public ResponceDTO findAuthorByName(String name) {
        List<Author> authors = authorRepository.findAll().stream().filter(a -> a.getAuthorName().equalsIgnoreCase(name)).collect(Collectors.toList());
        if (authors.isEmpty()) {
            return ResponceDTO.requestFalse(null,"Author not found");
        }
        return ResponceDTO.requestTrue(authors,"Author found successfully");
    }


}
