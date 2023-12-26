package web.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl implements CarService {
    private static int CAR_COUNT;
    private List<Car> carList;

    @Override
    public List<Car> getCars(int count) {
        carList = new ArrayList<>();
        carList.add(new Car(++CAR_COUNT, "AUDI", 4));
        carList.add(new Car(++CAR_COUNT, "BMW", 3));
        carList.add(new Car(++CAR_COUNT, "MB", 600));
        carList.add(new Car(++CAR_COUNT, "Volvo", 90));
        carList.add(new Car(++CAR_COUNT, "Vaz", 99));
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
