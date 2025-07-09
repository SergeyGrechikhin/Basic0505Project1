package basicjava.lesson9;

public class Book { //Создаем класс
    String title ;
    String producer;

    public Book(String title, String producer) { // Создаем конструктор
        this.title = title;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
