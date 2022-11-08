package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public class CarDaoImpl implements CarDao {
    private final static List<Car> listCars = List.of(
            new Car("BMW i5", 123456789, true),
            new Car("Audi A6", 234567890, false),
            new Car("Lada NIVA", 345678901, false),
            new Car("Tesla Model X", 456789012, true),
            new Car("Volvo XC90", 567890123, false));

    @Override
    public List<Car> getAllCars() {
        return listCars;

    }
    @Override
    public List<Car> getSublistOfCarsByCount(int count) {
        return listCars.subList(0, count);
    }

    @Override
    public int getSizeOfList() {
        return listCars.size();
    }
}
