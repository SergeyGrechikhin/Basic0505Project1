package basicjava.lesson22.service;

import basicjava.lesson22.entity.Car;
import basicjava.lesson22.repository.CarRepository;

public class CarService {
    private CarRepository carRepository ;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car[] addCar(String brand, int id, double price, String model) {
      /*  if (carRepository.getCarcounter() >= ShopConfiguration.MAXAUTO){
            System.out.println("Магазин заполнен");
            return null;
        }*/
        if (carRepository.findById(id) != null) {
            System.out.println("Машина с таким ID уже существует!");
            return null;
        }
        Car car = new Car(brand, id, price, model);
        carRepository.save(car);
        return new Car[]{car};
    }
    public Car findCarById(int id) {
        return carRepository.findById(id);
    }
    public Car[] getAllCars() {
        if (carRepository.getCarcounter() == 0) {
            return new Car[0];
        }
        return carRepository.findAllCars();
    }



    public Car[] findAllCarsByBrand(String brand) {
        return carRepository.findCarsByBrand(brand);
    }

    public Car[] findAllCarsByModel(String model) {
        return carRepository.findCarsByModel(model);
    }

    public Car[] findCarsByPrice(double minPrice, double maxPrice) {
        return carRepository.findCarsByPrice(minPrice, maxPrice);
    }
    public CarRepository getCarRepository() {
        return carRepository;
    }
    public CarRepository getRepository() {
        return carRepository;
    }
}
