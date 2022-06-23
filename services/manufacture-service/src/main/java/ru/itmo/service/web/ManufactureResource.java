package ru.itmo.service.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itmo.service.model.Product;
import ru.itmo.service.services.ManufactureService;

import java.util.List;

@RestController
@RequestMapping("/filter")
@RequiredArgsConstructor
public class ManufactureResource {

    private final ManufactureService manufactureService;

    @GetMapping(value = "/manufacturer/{id}", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<List<Product>> getByManufactureId(@PathVariable(name = "id") Integer id){
        return manufactureService.countByManufactureId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.noContent().build());
    }

    @GetMapping(value = "/price/{from}/{to}", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<List<Product>> getByManufactureId(@PathVariable(name = "from") Integer from,
                                                            @PathVariable(name = "to") Integer to){
        return manufactureService.getByCost(from, to)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.noContent().build());
    }
}
