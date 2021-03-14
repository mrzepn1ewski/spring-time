package pl.system.springtime.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.system.springtime.model.Car;
import pl.system.springtime.service.CarService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping("/cars/")
    public List<Car> getCars() {
        return carService.getCars();
    }
}
