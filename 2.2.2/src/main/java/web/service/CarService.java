package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarService {
    private  List<Car> cars = Arrays.asList(
            new Car("Subaru","impreza",300),
            new Car("Toyota","EA86",140),
            new Car("Lada","2101",89),
            new Car("Nissan","GTR",560),
            new Car("BMW","F90",450));
    public  List<Car> getCars(int count_car){
        List<Car> returnedCars = new ArrayList<>();
        for (int i=0;i<count_car;i++){
            returnedCars.add(cars.get(i));
        }
        return returnedCars;
    }
}
