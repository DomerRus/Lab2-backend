package ru.itmo.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itmo.service.model.enums.OrganizationType;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "organization")
public class Organization {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "fullName", nullable = false)
    private String fullName;
    @Column(name = "employeesCount")
    private Long employeesCount;
    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    private OrganizationType type;
}
