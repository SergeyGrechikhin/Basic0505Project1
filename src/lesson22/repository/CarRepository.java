package lesson22.repository;

import lesson22.ShopConfiguration;
import lesson22.entity.Car;

import java.util.Arrays;

public class CarRepository {
   private Car[] cars;
   private int carcounter;

    public CarRepository() {
        this.cars = new Car[ShopConfiguration.MAXAUTO];
        this.carcounter = 0;
    }
    public int getCarcounter() {
        return carcounter;
    }
    public boolean save(Car car){
        if (carcounter < cars.length) {
            cars[carcounter++] = car;
            return true;
        }
        return false;
    }
    public Car findById(int IdForSearch){
        for (int i = 0; i < carcounter; i++) {
            if (cars[i].getId() == IdForSearch) {
                return cars[i];
            }
        }
        return null;
    }
    public Car[] findAllCars(){
        return Arrays.copyOf(cars,carcounter);
    }



    public Car[] findCarsByBrand(String Brand) {
        int carsCounterfindCarsbyBrand = 0;
        for (int i = 0; i < carcounter; i++) {
            if (cars[i].getBrand().equalsIgnoreCase(Brand)) {
                carsCounterfindCarsbyBrand++;
            }
        }
        if (carsCounterfindCarsbyBrand == 0) {
            return new Car[0] ;
        }
        Car[] result = new Car[carsCounterfindCarsbyBrand];
        int index = 0;
        for (int i = 0; i < carcounter; i++) {
            if (cars[i].getBrand().equalsIgnoreCase(Brand)) {
                result[index++] = cars[i];
            }
        }
        return result;
    }



    public Car[] findCarsByModel(String model) {
        int carsCounterfindCarsByModel = 0 ;
        for (int i = 0; i < carcounter; i++) {
            if (cars[i].getModel().equalsIgnoreCase(model)) {
                carsCounterfindCarsByModel++;
            }
        }
        if (carsCounterfindCarsByModel == 0) {
            return new Car[0];
        }
        Car[] result = new Car[carsCounterfindCarsByModel];
        int index = 0;
        for (int i = 0; i < carcounter; i++) {
            if (cars[i].getModel().equalsIgnoreCase(model)) {
                result[index++] = cars[i];
            }
        }
        return result;
    }

    public Car[] findCarsByPrice(double minPrice, double maxPrice) {
        int count = 0 ;
                for (int i = 0; i < carcounter; i++) {
                    double price = cars[i].getPrice();
                    if (price >= minPrice && price <= maxPrice) {
                        count++;
                    }

                }
                if (count == 0) {
                    return new Car[0];
                }
                Car[] result = new Car[count];
                int index = 0;
                for (int i = 0; i < carcounter; i++) {
                    double price = cars[i].getPrice();
                    if (price >= minPrice && price <= maxPrice) {
                        result[index++] = cars[i];
                    }
                }
                return result;
    }

    public int getMaxCapacity(){
        return cars.length;
    }




}
