package web.service;

import org.springframework.stereotype.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("BMW", "M5", 2022));
        cars.add(new Car("Audi", "RS6", 2021));
        cars.add(new Car("Mercedes", "E63 AMG", 2023));
        cars.add(new Car("Porsche", "Panamera", 2020));
        cars.add(new Car("Tesla", "Model S", 2024));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
