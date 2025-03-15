package com.test_actuator.actuator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.assertj.MockMvcTester;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.awt.*;
import java.net.URI;

@SpringBootTest
@AutoConfigureMockMvc
public class RequisitionTest {

    @Autowired
    private MockMvc mock;

    @Test
    public void mustReturnError() throws Exception {
        URI uri = new URI("/health");
        mock.perform(MockMvcRequestBuilders.get(uri))
                .andExpect(MockMvcResultMatchers
                        .status()
                        .is(200));
    }
}

