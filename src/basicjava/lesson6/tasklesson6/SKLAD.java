package basicjava.lesson6.tasklesson6;

public class SKLAD {
 String name ;
 int quantity ;

    public SKLAD(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void give() {
        System.out.println("Daem Tovar");
        quantity = quantity - 1 ;

    }

    public void Textinfo() {
        System.out.println("Ostatok :" + quantity);
    }


}
