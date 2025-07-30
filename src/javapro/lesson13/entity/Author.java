package javapro.lesson13.entity;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String id;
    private String authorName;
    private String info;
    private List<Book> books;

    public Author(String id, String info, String authorName) {
        this.id = id;
        this.books = new ArrayList<>();
        this.info = info;
        this.authorName = authorName;
    }
    public void addBook(Book book) {
        books.add(book);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", info='" + info + '\'' +
                ", books=" + books +
                '}';
    }
}

//- id
//- authorName (уникальный)
//- info

