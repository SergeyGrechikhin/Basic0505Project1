package basicjava.lesson6.tasklesson6;

public class Cat {
    String name;
    int age;




    public void catname () {
        System.out.println("Привет нашу кошку зовут : " + name);
        System.out.println("Сейчас ей : " + age);
    }

    public void birthday(){
        System.out.println("Наша кошка отмечает день рождения");
        age = age + 1 ;


    }



}
