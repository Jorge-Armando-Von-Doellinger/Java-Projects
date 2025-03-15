package com.test_actuator.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public Map<String, String> healthCheck(){
        Map<String, String> status; status = new HashMap<>();
        status.put("status", "UP");
        status.put("message", "API funcionando");
        return status;
    }
}
