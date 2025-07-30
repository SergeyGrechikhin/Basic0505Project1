package javapro.lesson13.entity;

public class Book {
    private String isbn ;
    private String title;
    private String description;


    public Book(String isbn, String description, String title) {
        this.isbn = isbn;
        this.description = description;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}




//- isbn
//- title
//- Author
//- description
