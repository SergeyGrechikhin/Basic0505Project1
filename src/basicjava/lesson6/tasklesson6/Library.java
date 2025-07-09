package basicjava.lesson6.tasklesson6;

public class Library {
    String avtor ;
    String bookname ;
    int quantity ;
boolean onhand ;


public Library(String avtor, String bookname, int quantity, boolean onhand) {
        this.avtor = avtor;
        this.bookname = bookname;
        this.quantity = quantity;
        this.onhand = onhand;
    }

    public void textinfo() {
        System.out.println(" Название : " + bookname +  " Количество страниц :" + quantity);





}
public void textinfo1() {
    System.out.println(" На руках или нет : " +  onhand) ;
}

}
