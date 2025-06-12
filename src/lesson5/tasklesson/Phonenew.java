package lesson5.tasklesson;

public class Phonenew {
    public static void main(String[] args) {
        Phone phone1 = new Phone() ;

        phone1.catalognumber = 1 ;
        phone1.producer = "Apple" ;
        phone1.screendiagonal = 6.8 ;
        phone1.model = "Iphone Mini" ;
        phone1.memory = 128 ;
        phone1.color = "Red" ;
        phone1.pixelcamera = 48 ;
        phone1.batery = true ;

        System.out.println( "Номер Каталога : " + phone1.catalognumber);
        System.out.println("Производитель : " + phone1.producer);
        System.out.println("Размер диагонали : " + phone1.screendiagonal);
        System.out.println("Модель : " + phone1.model);
        System.out.println("Память телефона : " + phone1.memory + " GB ");
        System.out.println("Цвет : " + phone1.color );
        System.out.println("Сколько пикселей в камере : " + phone1.pixelcamera);
        System.out.println( "Тип зарядки Type-C (ДА ИЛИ НЕТ ) : " + phone1.batery);


        System.out.println("-----------------------------------------------");





        Phone phone2 = new Phone() ;

        phone2.catalognumber = 2 ;
        phone2.producer = "Samsung" ;
        phone2.screendiagonal = 6.9 ;
        phone2.model = "Galaxy" ;
        phone2.memory = 256 ;
        phone2.color = "Black" ;
        phone2.pixelcamera = 24 ;
        phone2.batery = false ;

        System.out.println( "Номер Каталога : " + phone2.catalognumber);
        System.out.println("Производитель : " + phone2.producer);
        System.out.println("Размер диагонали : " + phone2.screendiagonal);
        System.out.println("Модель : " + phone2.model);
        System.out.println("Память телефона : " + phone2.memory +  " GB ");
        System.out.println("Цвет : " + phone2.color );
        System.out.println("Сколько пикселей в камере : " + phone2.pixelcamera);
        System.out.println( "Тип зарядки Type-C (ДА ИЛИ НЕТ ) : " + phone2.batery);


    }
}
