package web.service;

import org.springframework.stereotype.Service;
import web.data.InsertInto;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CarServiceImpl implements CarService{

    private final InsertInto cars;

    CarServiceImpl(InsertInto cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> getListCar(int num) {
        return cars.getCars().stream().limit(num).collect(Collectors.toList());
    }
}
