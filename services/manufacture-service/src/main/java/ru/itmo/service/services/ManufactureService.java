package ru.itmo.service.services;

import ru.itmo.service.model.Product;

import java.util.List;
import java.util.Optional;

public interface ManufactureService {

    Optional<List<Product>> countByManufactureId(Integer id);

    Optional<List<Product>> getByCost(Integer from, Integer to);
}
