package basicjava.lesson22.repository;

import basicjava.lesson22.entity.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarRepositoryTest {
    private CarRepository carRepository;
    @BeforeEach
    void setUp() {
       carRepository = new CarRepository();
    }
    @Test
    void findById() {
        Car car = new Car("BWM" , 1,2000,"X5");
        boolean saved =  carRepository.save(car);
        assertTrue(saved);
        Car found = carRepository.findById(1);
        assertNotNull(found);
        assertEquals(found.getBrand(), car.getBrand());
    }

    @Test
    void findByBrand() {
        Car car = new Car("BWM" , 1,2000,"X5");
        Car car2 = new Car("Audi" , 2,2000,"X5");
        Car car3 = new Car("Tesla" , 3,2000,"X5");
        carRepository.save(car);
        carRepository.save(car2);
        carRepository.save(car3);
        Car[] cars = carRepository.findCarsByBrand("Audi");
        assertEquals(1, cars.length);
        assertEquals("Audi", cars[0].getBrand());
    }

}