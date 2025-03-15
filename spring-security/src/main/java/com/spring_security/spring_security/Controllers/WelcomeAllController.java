package com.spring_security.spring_security.Controllers;

import com.sun.source.doctree.EscapeTree;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hello")
public class WelcomeAllController {

    @GetMapping
    public String getHello() { return "Welcome, unknown client"; }
}
