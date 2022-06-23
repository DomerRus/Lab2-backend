package ru.itmo.product.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.itmo.product.model.Product;
import ru.itmo.product.model.enums.UnitOfMeasure;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    void deleteAllByUnitOfMeasure(UnitOfMeasure unitOfMeasure);
    List<Product> findAllByManufacturer_Id(Integer id);

    @Query(value = "SELECT DISTINCT ON (manufacture_cost) * FROM products", nativeQuery = true)
    List<Product> findDistinctByManufactureCost();
}
