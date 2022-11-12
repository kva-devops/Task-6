package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> carList = carDao.getCars();
        if (count == null || count >= carList.size()) {
            return carList;
        }
        return carList.subList(0, count);

    }
}
