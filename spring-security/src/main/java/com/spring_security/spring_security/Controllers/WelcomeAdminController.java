package com.spring_security.spring_security.Controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin/hello")
public class WelcomeAdminController {

    @GetMapping
    // @PreAuthorize("hasRole('MANAGERS')")
    public String getHello() {
        return "Welcome to my application, user!";
    }
}
