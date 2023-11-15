package web.services;

import web.model.Car;

import java.util.List;

public interface CarServices {
    List<Car> getCars(int count);
}