package pl.system.springtime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.system.springtime.model.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
