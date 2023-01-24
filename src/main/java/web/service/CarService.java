package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, 4, "porse"));
        cars.add(new Car(2, 4, "fera"));
        cars.add(new Car(3, 4, "tayota"));
        cars.add(new Car(4, 4, "mers"));
        cars.add(new Car(5, 4, "mazda"));
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
