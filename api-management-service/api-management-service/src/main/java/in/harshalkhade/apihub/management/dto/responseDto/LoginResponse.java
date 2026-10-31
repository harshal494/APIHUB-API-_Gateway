package in.harshalkhade.apihub.management.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
//@NoArgsConstructor  // i accidentally write this annotation and it used to create the empty constructor which not work in this response dto, so instead use AllArgumentConstructor that creates the constructor for all the fields
public class LoginResponse {

    private String token;
    private String tokenType;
    private Long expiresInSeconds;
    private String role;
    private Long organizationId;

//    public LoginResponse(String token, String tokenType, long expirationSeconds, String role, Long organizationId) {
//        this.token = token;
//        this.tokenType=tokenType;
//        this.expiresInSeconds=expirationSeconds;
//        this.role=role;
//        this.organizationId=organizationId;
//    }
}

