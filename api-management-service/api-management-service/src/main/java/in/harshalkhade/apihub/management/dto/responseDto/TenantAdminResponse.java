package in.harshalkhade.apihub.management.dto.responseDto;

import in.harshalkhade.apihub.management.entity.ManagementUser;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TenantAdminResponse {

    private Long id;
    private Long organizationId;
    private String username;
    private Boolean enabled;

    public static TenantAdminResponse from(ManagementUser user) {
        return new TenantAdminResponse(
                user.getId(),
                user.getOrganization().getId(),
                user.getUsername(),
                user.isEnabled());
    }
}
