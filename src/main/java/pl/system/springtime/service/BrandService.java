package pl.system.springtime.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.system.springtime.model.Brand;
import pl.system.springtime.repository.BrandRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandService {

    private final BrandRepository brandRepository;

//    public Brand getBrandNameById(Integer id) {
//        return brandRepository.findById(id);
//    }

    public List<Brand> getBrands() {
        return brandRepository.findAll();
    }
}
