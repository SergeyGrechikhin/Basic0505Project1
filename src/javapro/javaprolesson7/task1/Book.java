package javapro.javaprolesson7.task1;

public class Book implements Comparable<Book> {
   private String bookName;
    private int year;
    private BookAuthor author;

    public String getBookName() {
        return bookName;
    }



    public BookAuthor getAuthor() {
        return author;
    }

    public Book(String bookName, int year, BookAuthor author) {
        this.bookName = bookName;
        this.year = year;
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Book anotherBook) {
        return this.bookName.compareTo(anotherBook.bookName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", year=" + year +
                ", author=" + author +
                '}';
    }
}
