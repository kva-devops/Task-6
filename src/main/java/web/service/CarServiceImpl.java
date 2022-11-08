package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(String count) {
        if (count == null) {
            return carDao.getAllCars();
        }
        if (!count.matches("\\d*")) {
            return new ArrayList<>();
        }
        if (Integer.parseInt(count) >= carDao.getSizeOfList()) {
            return carDao.getAllCars();
        }
        return carDao.getSublistOfCarsByCount(Integer.parseInt(count));
    }
}
