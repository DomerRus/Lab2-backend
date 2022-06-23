package ru.itmo.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itmo.product.model.Organization;
import ru.itmo.product.model.enums.OrganizationType;

import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {

    Optional<Organization> findByNameAndFullNameAndAndEmployeesCountAndType(String name,
                                                                            String fullName,
                                                                            Long emplCount,
                                                                            OrganizationType organizationType);
}
