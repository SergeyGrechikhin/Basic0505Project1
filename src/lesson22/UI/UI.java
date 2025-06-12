package lesson22.UI;

import lesson22.entity.Car;
import lesson22.service.CarService;

import java.util.Scanner;

public class UI {
    private CarService carService;
    Scanner input = new Scanner(System.in);

    public UI(CarService carService) {
        this.carService = carService;
    }

    public void createCounterCar(){
        System.out.println("Введите сколько машин вы хотите добавить в базу данных");
        int carscounter = input.nextInt();
        input.nextLine();

        for (int i = 0; i < carscounter; i++) {
            System.out.println("Введите название бренда");
            String brand = input.nextLine();
            System.out.println("Введите название модели");
            String model = input.nextLine();
            System.out.println("Введите ID машины/OnlyINT");
            int id = input.nextInt();
            input.nextLine();
            System.out.println("Введите цену машины/OnlyDouble");
            double price = input.nextDouble();
            input.nextLine();


            Car[] savedcar = carService.addCar(brand, id, price, model);
            if(savedcar != null){
                System.out.println("Машина добавлена " );
            } else  {
                System.out.println("Машину добавить не получилось");
            }

        }

    }

    private void printInfoforFindtoId(){
        System.out.println("Введите ID по которому хотите найти машину");
        int id = input.nextInt();
        input.nextLine();
        Car foundIdCar = carService.findCarById(id);
        if(foundIdCar != null){
            System.out.println("Ваша Машина " + foundIdCar);
        } else   {
            System.out.println("Ваша машина не найдена");
        }
    }





    private void printInfoforFindbyBrandsCars(){
        System.out.println("Введите бренд машины которую хотите найти");
        String brand = input.nextLine();
        Car[] foundBrandCar = carService.findAllCarsByBrand(brand);
        if(foundBrandCar.length == 0){
            System.out.println("Машины брэнда " +  brand  + " не найдены");
        } else {
            System.out.println("Машины брэнда " +  brand  +  " : " );
            for (int i = 0; i < foundBrandCar.length ; i++) {
                System.out.println(" - " + foundBrandCar[i]);
            }
        }
    }

    private void printInfoforFindbyModelCars(){
        System.out.println("Введите модель машины которую хотите найти");
        String carsmodel = input.nextLine();
        Car[] foundModelCar = carService.findAllCarsByModel(carsmodel);
        if(foundModelCar.length == 0){
            System.out.println("Модели машин " +  carsmodel  + " не найдены");
        } else {
            System.out.println("Модели машин " +
                    " " +  carsmodel  +  " : " );
            for (int i = 0; i < foundModelCar.length ; i++) {
                System.out.println(" - " + foundModelCar[i]);
            }
        }
    }
    public void printInfo() {
        Car[] cars = carService.getAllCars();
        if ( cars.length == 0) {
            System.out.println("Машины ещё не добавлены в катaлог");
            return;
        }
        System.out.println(" Информация : ") ;
        for (int i = 0; i < cars.length ; i++) {
            if (cars[i] == null) {
                return;
            }
            System.out.println( " \n---- " + "\nБренд Машины : " + cars[i].getBrand() + "  " + "\nМодель машины : " + cars[i].getModel() + "\nID : " + cars[i].getId() + "\nЦена машины" + cars[i].getPrice());
        }
    }

    private void findByPrice(){
        System.out.println(" Min Price : ") ;
        double minPrice = input.nextDouble();
        input.nextLine();
        System.out.println(" Max Price : ") ;
        double maxPrice = input.nextDouble();
        input.nextLine();
        Car[] cars = carService.findCarsByPrice(minPrice, maxPrice);
        if(cars.length == 0){
            System.out.println("This Price not Found");
        } else  {
            System.out.println(" This Price Found : ");
            for (int i = 0; i < cars.length ; i++) {
                System.out.println(" \n---- " + "\nБренд Машины : " + cars[i].getBrand() + "  " + "\nМодель машины : " + cars[i].getModel() + "\nID : " + cars[i].getId() + "\nЦена машины" + cars[i].getPrice());
            }
        }
    }




    public void userMenu(){
        while(true){
            System.out.println(" ===*Menu*=== ");
            System.out.println("1. Добавить машину/машины в базу данных.");
            System.out.println("2. Найти машину в базе данных ");
            System.out.println("3. Вывести все машины в базе данных.");
            System.out.println("0. Выйти из программы.");

            String userChoice = input.nextLine();
            switch (userChoice) {
                case "1":
                    createCounterCar();
                    break;

                case "2":
                    while (true) {
                        System.out.println("\n===*Поиск Машин*===");
                        System.out.println("1. Найти машину по ID");
                        System.out.println("2. Найти машину по брэнду");
                        System.out.println("3. Найти мащину по модели");
                        System.out.println("4. Найти машину по цене");
                        System.out.println("0. Вернуться в основное меню");
                        String userСhoiceExtra = input.nextLine();
                        switch (userСhoiceExtra) {
                            case "1":
                                printInfoforFindtoId();
                                break;
                            case "2":
                                printInfoforFindbyBrandsCars();
                                break;
                            case "3":
                                printInfoforFindbyModelCars();
                                break;
                                case "4":
                                    findByPrice();
                                    break;
                            case "0":
                                System.out.println("Возврат в главное меню");
                                break;
                            default:
                                System.out.println("Вы сделали что не так !");
                        }
                        if (userСhoiceExtra.equals("0")) {
                            break;
                        }
                    }
                    break;


                case "3":
                    printInfo();
                    break;
                case "0":
                    System.out.println("Выход из программы");
                    return;
                default:
                    System.out.println("Вы сделали что не то!");
            }

        }
    }
}
