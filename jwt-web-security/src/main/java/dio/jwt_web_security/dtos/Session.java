package dio.jwt_web_security.dtos;

import lombok.Data;

@Data
public class Session {
    private String login;
    private String token;
}
