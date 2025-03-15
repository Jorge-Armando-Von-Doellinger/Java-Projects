package dio.jwt_web_security.service;

import dio.jwt_web_security.model.User;
import dio.jwt_web_security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder encoder;
    public void createUser(User user) {
        var pass = user.getPassword();
        user.setPassword(encoder.encode(pass));
        repository.save(user);
    }
}
