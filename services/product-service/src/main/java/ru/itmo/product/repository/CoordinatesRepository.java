package ru.itmo.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itmo.product.model.Coordinates;

public interface CoordinatesRepository extends JpaRepository<Coordinates, Integer> {
}
