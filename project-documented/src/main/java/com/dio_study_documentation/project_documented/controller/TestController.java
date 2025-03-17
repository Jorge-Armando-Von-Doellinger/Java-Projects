package com.dio_study_documentation.project_documented.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("test-err")
    public Object errTest(@RequestBody String name) {
        return null;
    }
}
