package web.services;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("bmw", 3, 2005));
        cars.add(new Car("mercedes", 1, 2010));
        cars.add(new Car("audi", 6, 2020));
        cars.add(new Car("volkswagen", 2, 2023));
        cars.add(new Car("bmw", 5, 2024));
    }

    @Override
    public List<Car> carList(int count) {
        return cars.stream().limit(count).toList();
    }
}
