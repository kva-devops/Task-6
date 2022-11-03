package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public class CarDaoImpl implements CarDao {

    private final CopyOnWriteArrayList<Car> listCars = new CopyOnWriteArrayList<>() {{
       add(new Car("BMW i5", 123456789, true));
       add(new Car("Audi A6", 234567890, false));
       add(new Car("Lada NIVA", 345678901, false));
       add(new Car("Tesla Model X", 456789012, true));
       add(new Car("Volvo XC90", 567890123, false));
    }};

    @Override
    public List<Car> getCars(String count) {
        List<Car> result = new ArrayList<>();
        if (count == null) {
            result.addAll(listCars);
        } else {
            if (count.matches("\\d*")) {
                if (Integer.parseInt(count) >= listCars.size()) {
                    result.addAll(listCars);
                } else {
                    for (int i = 0; i < Integer.parseInt(count); i++) {
                        result.add(listCars.get(i));
                    }
                }
            }
        }
        return result;
    }
}
