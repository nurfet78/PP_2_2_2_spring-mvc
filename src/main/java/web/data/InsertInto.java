package web.data;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInto {

    private List<Car> cars = new ArrayList<>();
    public InsertInto() {
        cars = Arrays.asList(
                new Car("Ford","2001", "234"),
                new Car("Skoda","1999", "123"),
                new Car("Infinity","2010", "27"),
                new Car("Nissan","2022", "002"),
                new Car("BMW","2009", "003"),
                new Car("Dodge","1978", "012"),
                new Car("Tesla","2023", "432"),
                new Car("Kia","2000", "003"),
                new Car("Lada","1996", "324"),
                new Car("Audi","2021", "003")
        );
    }

    public List<Car> getCars() {
        return cars;
    }
}
