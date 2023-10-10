package web.services;

import web.models.Car;

import java.util.List;

public interface CarService {

    List<Car> carList(int count);

}
