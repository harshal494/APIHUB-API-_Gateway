package in.harshalkhade.apihub.management.dto.requestDto;

import in.harshalkhade.apihub.management.entity.OrganizationStatus;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrganizationStatusRequest {

    @NotNull
    private OrganizationStatus status;
}
