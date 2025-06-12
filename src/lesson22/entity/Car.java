package lesson22.entity;

public class Car {
    private String brand;
    private String model;
    private double price;
    private int id;

    public Car(String brand, int id, double price, String model) {
        this.brand = brand;
        this.id = id;
        this.price = price;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }



    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
