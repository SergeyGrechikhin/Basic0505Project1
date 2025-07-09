package basicjava.lesson6.tasklesson6;

public class CatDemo {
    public static void main(String[] args) {
        Cat mycat = new Cat();
        mycat.name = "MURKA" ;
        mycat.age = 5 ;


        mycat.catname();
        mycat.birthday();


        System.out.println("------------------------------");

        mycat.catname();


        System.out.println("---------------------------------");
        Cat mycat1 = new Cat();
        mycat1.name = "KOT" ;
        mycat1.age = 89;
        mycat1.catname();
        mycat1.birthday();
        System.out.println("------------------------------");

        mycat1.catname();



    }
}
