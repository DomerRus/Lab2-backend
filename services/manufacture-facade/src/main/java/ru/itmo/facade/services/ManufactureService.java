package ru.itmo.facade.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.itmo.facade.model.Product;

import java.util.List;

@FeignClient(value = "manufacture-service")
public interface ManufactureService {

    @GetMapping("/filter/manufacturer/{id}")
    ResponseEntity<List<Product>> getByManufactureId(@PathVariable(name = "id") Integer id);

    @GetMapping("/filter/price/{from}/{to}")
    ResponseEntity<List<Product>> getByCost(@PathVariable(name = "from") Integer from,
                                            @PathVariable(name = "to") Integer to);

}
