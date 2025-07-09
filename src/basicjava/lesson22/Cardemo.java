package basicjava.lesson22;

import basicjava.lesson22.UI.UI;
import basicjava.lesson22.repository.CarRepository;
import basicjava.lesson22.service.CarService;

public class Cardemo {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository();
        CarService carService = new CarService(carRepository);
        UI ui = new UI(carService);
        ui.userMenu();
    }
}
