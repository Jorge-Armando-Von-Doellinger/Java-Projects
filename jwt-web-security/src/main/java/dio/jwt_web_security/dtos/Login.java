package dio.jwt_web_security.dtos;

import lombok.Data;

@Data
public class Login {
    private String username;
    private String password;
}
