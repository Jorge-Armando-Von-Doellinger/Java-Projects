package dio.jwt_web_security.controller;

import dio.jwt_web_security.model.User;
import dio.jwt_web_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public String welcomeUser() {
        return "Welcome, user!";
    }

    @PostMapping
    public void postUser(@RequestBody User user) {
        service.createUser(user);
    }
}
