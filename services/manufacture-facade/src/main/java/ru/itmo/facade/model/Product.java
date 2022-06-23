package ru.itmo.facade.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itmo.facade.model.enums.UnitOfMeasure;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private Integer id;
    private String name;
    private Coordinates coordinates;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
    private LocalDateTime creationDate;
    private Integer price;
    private Double manufactureCost;
//    @Enumerated(EnumType.STRING)
    private UnitOfMeasure unitOfMeasure;
    private Organization manufacturer;

}
