package ru.itmo.service.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.itmo.service.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    List<Product> findAllByManufacturer_Id(Integer id);

    List<Product> findAllByPriceIsGreaterThanEqualAndPriceIsLessThanEqual(Integer from, Integer to);

}
