package dio.jwt_web_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Welcome, unknown user!";
    }



    @GetMapping("/managers")
    public String welcomeManager() {
        return "Welcome, manager!";
    }
}
