package in.harshalkhade.apihub.management.dto.requestDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.boot.models.annotations.internal.ImmutableAnnotation;

@Getter
@Setter
public class OrganizationRequest {

    @NotBlank
    @Size(max = 150)
    private String name;

    @NotBlank
    @Size( max = 100)
    @Pattern(regexp = "^[a-z0-9]+(?:[a-z0-9]+)*$",
    message = "slug must contain lowercase letters, number and single hyphen")
    private String slug;


}
