package com.spring_security.spring_security.Controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user/hello")
public class WelcomeUserController {

    @GetMapping
    // @PreAuthorize("hasRole('USERS')")
    public String getHello() {
        return "Welcome to my application, user!";
    }
}

