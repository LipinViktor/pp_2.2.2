package web.service;

import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService{

    @Override
    public List<Car> getCar(List<Car> cars, String val) {
        if(val != null) {
            return cars.stream().limit(Long.parseLong(val)).collect(Collectors.toList());
        } else {
            return cars;
        }
    }
}
