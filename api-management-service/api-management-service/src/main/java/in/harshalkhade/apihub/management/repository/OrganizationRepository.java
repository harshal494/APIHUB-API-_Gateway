package in.harshalkhade.apihub.management.repository;

import in.harshalkhade.apihub.management.entity.Organization;
import in.harshalkhade.apihub.management.entity.OrganizationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    boolean existsBySlugIgnoreCase(String slug);

    boolean existsByNameIgnoreCase(String name);

    List<Organization> findAllByStatusNot(OrganizationStatus status);

    Optional<Organization> findByIdAndStatusNot(Long id, OrganizationStatus status);
}
