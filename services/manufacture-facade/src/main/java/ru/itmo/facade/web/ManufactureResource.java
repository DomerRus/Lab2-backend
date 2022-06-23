package ru.itmo.facade.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itmo.facade.model.Product;
import ru.itmo.facade.services.ManufactureService;

import java.util.List;

@RestController
@RequestMapping("/ebay/filter")
@RequiredArgsConstructor
public class ManufactureResource {

    private final ManufactureService manufactureService;

    @GetMapping(value = "/manufacturer/{id}")
    public ResponseEntity<?> getByManufactureId(@PathVariable(name = "id") Integer id){
        try {
            return manufactureService.getByManufactureId(id);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body(e.getMessage());
        }
    }

    @GetMapping(value = "/price/{from}/{to}")
    public ResponseEntity<?> getByManufactureId(@PathVariable(name = "from") Integer from,
                                                            @PathVariable(name = "to") Integer to){
        try {
            return manufactureService.getByCost(from, to);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body(e.getMessage());
        }
    }
}
