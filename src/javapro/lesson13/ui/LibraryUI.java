package javapro.lesson13.ui;

import javapro.lesson13.dto.ResponceDTO;
import javapro.lesson13.entity.Author;
import javapro.lesson13.entity.Book;
import javapro.lesson13.service.AuthorService;
import javapro.lesson13.service.BookService;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class LibraryUI {
    private final AuthorService authorService;
    private final BookService bookService;
    Scanner scanner = new Scanner(System.in);

    public LibraryUI(AuthorService authorService, BookService bookService) {
        this.authorService = authorService;
        this.bookService = bookService;
    }
    private void createBooks (){
        System.out.println("Enter your isbn :");
        String isbn = scanner.nextLine();
        System.out.println("Enter your title :");
        String title = scanner.nextLine();
        System.out.println("Enter your description :");
        String description = scanner.nextLine();
        ResponceDTO<?> responce = bookService.create(isbn,description,title);
        System.out.println(responce.getMessage());
        if (!responce.isSuccess()) return;
        while(true){
            System.out.println("Enter Author ID to attach the book : ");
            String authorId = scanner.nextLine();
            ResponceDTO<?> attachResponce = authorService.addBookToAuthor(isbn,authorId);
            if (attachResponce.isSuccess()) {
                System.out.println(attachResponce.getMessage());
                break;
            } else  {
                boolean cancel = authorsNotFound();
                if (cancel) {
                    System.out.println("Operation cancelled");
                    break;
                }
            }
        }

    }

    private boolean authorsNotFound (){
        while(true){
            System.out.println("Authors not found");
            System.out.println("1.Enter your author id again.");
            System.out.println("2.Show all authors");
            System.out.println("3.Create new author");
            String choice = scanner.nextLine();
            switch (choice){
                case "1" -> {
                    return false ;
                }
                case "2" -> showAuthors();
                case "3" -> createAuthors();
                default -> System.out.println("Wrong choice");

            }
        }

    }

    private void createAuthors (){
        System.out.println("Enter your Author name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your  id: ");
        String id = scanner.nextLine();
        System.out.println("Enter info about author");
        String info = scanner.nextLine();
        ResponceDTO<?> responce = authorService.createAuthor(id,info,name);
        System.out.println(responce.getMessage());
    }

  /* private void bookToAuthors (){
       List<Author> authors = authorService.getAllAuthors();
       if (authors == null || authors.isEmpty()){
           System.out.println("You need to assighn the book to an author , but no authors exist yet");
           createAuthors();
       }
       if (authors != null || !authors.isEmpty()){
           System.out.println("Add Book to Author");
           System.out.println("Enter your  book isbn :");
           String isbn = scanner.nextLine();
           System.out.println("Enter your  Author id :");
           String autId = scanner.nextLine();
           ResponceDTO<?> responce = authorService.addBookToAuthor(isbn,autId);
           System.out.println(responce.getMessage());
       }
    } */



    private void showBook () {
        List<Book> books = bookService.findAll();
        if (books.isEmpty()) {
            System.out.println("Employee list is empty");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private void showAuthors() {
        List<Author> authors = authorService.getAllAuthors();
        if (authors.isEmpty()) {
            System.out.println("Department list is empty");
            return;
        }
        for (Author author : authors) {
            System.out.println(author);
            for (Book book : author.getBooks()) {
                System.out.println(book);
            }
        }
    }

    private void printInfoResponse(ResponceDTO responce){
        System.out.println(responce.getMessage());
        if (responce.getData() != null){
            System.out.println("Info");
            System.out.println(responce.getData());
        }
    }

    private void searchBookByIsbn (){
        System.out.println("Enter book isbn : ");
        String title = scanner.nextLine();
        printInfoResponse(bookService.findByIsbnUser(title));

    }

    private void searchBookByTitle (){
        System.out.println("Enter book title : ");
        String title = scanner.nextLine();
        printInfoResponse(bookService.findByTitle(title));
    }

    private void searchAuthorbyName(){
        System.out.println("Enter Author name : ");
        String name = scanner.nextLine();
        printInfoResponse(authorService.findAuthorByName(name));
    }

    private void findBookBzTitleWithAuthor(){
        System.out.println("Enter book title : ");
        String title = scanner.nextLine();
        ResponceDTO<?> responce = authorService.findBookByTitlewithAuthor(title);
        System.out.println(responce.getMessage());
    }

    public void menu(){
        while (true) {
            System.out.println("===*Menu*===");
            System.out.println("1.Create Book");
            System.out.println("2.Create Author");
            System.out.println("3.Find book by title");
            System.out.println("4.Find book by author  name");
            System.out.println("5.Find book by isbn");

            System.out.println("7.Find Book with Author");
            System.out.println("0.Выход");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> createBooks();
                case "2" -> createAuthors();
                case "3" -> searchBookByTitle();
                case "4" -> searchAuthorbyName();
                case "5" -> searchBookByIsbn();
                case "7" -> findBookBzTitleWithAuthor();
                case "0" ->{
                    System.out.println("Exit");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");

            }

        }
    }







}
