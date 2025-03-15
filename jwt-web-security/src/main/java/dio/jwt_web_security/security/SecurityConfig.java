package dio.jwt_web_security.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "security.config")
public class SecurityConfig {
    private String prefix;
    private String key;
    private Long expiration;

    public static String PREFIX;
    public static String KEY;
    public static Long EXPIRATION;

    @PostConstruct
    public void init() {
        PREFIX = this.prefix;
        KEY = this.key;
        EXPIRATION = this.expiration;
    }
}
