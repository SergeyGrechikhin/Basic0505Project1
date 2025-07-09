package basicjava.lesson9;

public class Bookdemo {
    public static void main(String[] args) {

        Bookservice bookservice = new Bookservice() ; //Вызвал Сервис
        Book newbook1 = bookservice.bookgenerate() ; //Задал данные какой шаблон использовать
        System.out.println(newbook1);
        Book newbook2 = bookservice.bookgenerate() ;
        System.out.println(newbook2);
        Book newbook3 = bookservice.bookgenerate() ;
        System.out.println(newbook3);

    }
}
