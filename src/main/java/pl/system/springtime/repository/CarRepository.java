package pl.system.springtime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.system.springtime.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
}
