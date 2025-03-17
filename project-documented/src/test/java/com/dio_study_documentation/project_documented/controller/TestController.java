package com.dio_study_documentation.project_documented.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping
    public Object obj() {
        return "Test - get mapping - swagger";
    }
    @PostMapping
    public Object postObj(@RequestBody String name) {
        return String.format("%s %s", name, "lindo demais");
    }
}
