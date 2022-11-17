package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final static List<Car> listCars = List.of(
            new Car("BMW i5", 123456789, true),
            new Car("Audi A6", 234567890, false),
            new Car("Lada NIVA", 345678901, false),
            new Car("Tesla Model X", 456789012, true),
            new Car("Volvo XC90", 567890123, false),
            new Car("Lada 2105", 345534566, false),
            new Car("Lada 2110", 234234522, false));

    @Override
    public List<Car> getCars() {
        return new ArrayList<>(listCars);
    }
}
