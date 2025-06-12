package lesson7.tasklesson;

public class Animal {
    private String typeanimal ;
    private String poroda ;
    private String name ;
    private int age ;

    public Animal(String typeanimal, int age, String name, String poroda) {
        this.typeanimal = typeanimal;
        this.age = age;
        this.name = name;
        this.poroda = poroda;
    }

    public String getTypeanimal() {
        return typeanimal;
    }

    public String getPoroda() {
        return poroda;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "typeanimal='" + typeanimal + '\'' +
                ", poroda='" + poroda + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
