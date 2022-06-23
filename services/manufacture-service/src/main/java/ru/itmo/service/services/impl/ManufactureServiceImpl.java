package ru.itmo.service.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itmo.service.model.Product;
import ru.itmo.service.repository.ProductRepository;
import ru.itmo.service.services.ManufactureService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ManufactureServiceImpl implements ManufactureService {

    private final ProductRepository productRepository;

    @Override
    public Optional<List<Product>> countByManufactureId(Integer id){
        List<Product> products = productRepository.findAllByManufacturer_Id(id);
        if(products.size()>0) {
            return Optional.of(products);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Optional<List<Product>> getByCost(Integer from, Integer to){
        List<Product> products = productRepository.findAllByPriceIsGreaterThanEqualAndPriceIsLessThanEqual(from, to);
        if(products.size()>0) {
            return Optional.of(products);
        } else {
            return Optional.empty();
        }
    }
}
