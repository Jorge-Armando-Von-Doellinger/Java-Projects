package dio.jwt_web_security.controller;

import dio.jwt_web_security.dtos.Login;
import dio.jwt_web_security.dtos.Session;
import dio.jwt_web_security.model.User;
import dio.jwt_web_security.repository.UserRepository;
import dio.jwt_web_security.security.JWTCreator;
import dio.jwt_web_security.security.JWTObject;
import dio.jwt_web_security.security.SecurityConfig;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class LoginController {
    private PasswordEncoder encoder;
    private SecurityConfig securityConfig;
    private UserRepository repository;
    public LoginController(PasswordEncoder encoder,
                           SecurityConfig securityConfig,
                           UserRepository repository) {
        this.securityConfig = securityConfig;
        this.encoder = encoder;
        this.repository = repository;
    }

    @PostMapping("/login")
    public Session login(@RequestBody Login login) {
        User user = repository.findByUsername(login.getUsername());
        if (user == null) { throw new RuntimeException("Unexpected error on login. Please, verify your data and try again...!"); }
        boolean passOk = encoder.matches(login.getPassword(), user.getPassword());
        if (!passOk) { throw new RuntimeException("Invalid password"); }
        Session session  = new Session();
        session.setLogin(user.getUsername());

        JWTObject jwtObject = new JWTObject();
        jwtObject.setIssuedAt(new Date(System.currentTimeMillis()));
        jwtObject.setExpiration(new Date(System.currentTimeMillis() + SecurityConfig.EXPIRATION));
        jwtObject.setRoles(user.getRoles());
        session.setToken(JWTCreator.create(SecurityConfig.PREFIX, SecurityConfig.KEY, jwtObject));
        return session;
    }

}

