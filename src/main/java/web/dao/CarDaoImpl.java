package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("BMW", "green", 2000));
        cars.add(new Car("Mercedes", "blue", 1999));
        cars.add(new Car("Audi", "red", 2002));
        cars.add(new Car("Vol", "black", 2004));
        cars.add(new Car("Ford", "white", 2001));
    }

    @Override
    public List<Car> getCarList() {
        return getCarList(0);
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count == 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCars() {
        return getCars();
    }

    @Override
    public List<Car> getCars(int count) {
        return getCars();
    }

}