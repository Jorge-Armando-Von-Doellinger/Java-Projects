package com.test_actuator.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Component
public class HealthChecker implements HealthIndicator {
    @Override
    public Health health() {
        try {
            InetAddress address = InetAddress.getByName("localhost");
            if(address.isReachable(10000)){
                return Health.up().build();
            }
        } catch (Exception ex) {
            return Health.down().withDetail("error", ex.getMessage()).build();
        }
        return Health.down().withDetail("error", "Unknown error").build();
    }
}
