package ru.itmo.facade.services.fallbacks;

import org.springframework.http.ResponseEntity;
import ru.itmo.facade.model.Product;
import ru.itmo.facade.services.ManufactureService;

import java.util.List;

public class ManufactureFallback implements ManufactureService {
    @Override
    public ResponseEntity<List<Product>> getByManufactureId(Integer manufactureId) {
        return ResponseEntity.badRequest().build();
    }

    @Override
    public ResponseEntity<List<Product>> getByCost(Integer from, Integer to) {
        return ResponseEntity.badRequest().build();
    }
}
