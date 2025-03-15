package com.test_actuator.actuator;

import com.sun.jdi.event.AccessWatchpointEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActuatorApplicationTests {
	@Autowired
	private HealthChecker controller;
	@Test
	void contextLoads() {
		System.out.println(true == true);
		System.out.println(controller.health().getStatus());
	}

}
