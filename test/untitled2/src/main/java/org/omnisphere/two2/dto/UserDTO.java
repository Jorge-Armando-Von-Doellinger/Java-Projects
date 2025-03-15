package org.omnisphere.two2.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDTO {
    private int id;
    private String name;
    private LocalDate birthDay;
}
