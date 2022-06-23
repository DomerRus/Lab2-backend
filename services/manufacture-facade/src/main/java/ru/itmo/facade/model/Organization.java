package ru.itmo.facade.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itmo.facade.model.enums.OrganizationType;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Organization {
    private Integer id;
    private String name;
    private String fullName;
    private Long employeesCount;
//    @Enumerated(EnumType.STRING)
    private OrganizationType type;
}
