package in.harshalkhade.apihub.management.repository;

import in.harshalkhade.apihub.management.entity.ManagementUser;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ManagementUserRepository extends JpaRepository<ManagementUser, Long> {

    Optional<ManagementUser> findByUsername(String username);

    Optional<Object> findByOrganizationId(Long organizationId);

    boolean existsByUsername(String username);
}


