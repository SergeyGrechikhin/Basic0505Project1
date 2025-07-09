package basicjava.lesson7.tasklesson;

import java.util.Scanner;

public class Animaldemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Введите данные о животном  ");

        System.out.println("Введите тип животного : ");
        String animaltype = scanner.nextLine() ;

        System.out.println("Введите пароду животного : ");
        String poroda = scanner.nextLine() ;

        System.out.println("Введите имя животного : ");
        String animalname = scanner.nextLine() ;

        System.out.println("Введите возвраст животного : ");
        int animalage = scanner.nextInt() ;

        Animal animal = new Animal(animaltype,animalage,animalname,poroda) ;

        //System.out.println("Данные о животном : " + animaltype + animalage + animalname + poroda );
        System.out.println(animal);




    }
}



//private String typeanimal ;
//    private String poroda ;
//    private String name ;
//    private int age ;