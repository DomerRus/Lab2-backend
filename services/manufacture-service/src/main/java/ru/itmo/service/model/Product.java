package ru.itmo.service.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itmo.service.model.enums.UnitOfMeasure;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @OneToOne
    @JoinColumn(name = "coordinates_id", nullable = false)
    private Coordinates coordinates;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
    @Column(name = "creationDate", nullable = false)
    private LocalDateTime creationDate;
    @Column(name = "price")
    private Integer price;
    @Column(name = "manufactureCost", nullable = false)
    private Double manufactureCost;
    @Column(name = "unitOfMeasure")
    @Enumerated(EnumType.STRING)
    private UnitOfMeasure unitOfMeasure;
    @OneToOne
    @JoinColumn(name = "manufacturer_id")
    private Organization manufacturer;

}
