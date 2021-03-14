package pl.system.springtime.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.system.springtime.model.Car;
import pl.system.springtime.repository.CarRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public Car getCarById(Integer id) {
        return this.carRepository.getOne(id);
    }

    public List<Car> getCars() {
        return this.carRepository.findAll();
    }
}
